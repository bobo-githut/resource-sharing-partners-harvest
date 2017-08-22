package org.nishen.resourcepartners.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.nishen.resourcepartners.entity.ElasticSearchPartner;
import org.nishen.resourcepartners.entity.ElasticSearchSuspension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class LaddDAOImpl implements LaddDAO
{
	private static final Logger log = LoggerFactory.getLogger(LaddDAOImpl.class);

	private static final SimpleDateFormat idf = new SimpleDateFormat("dd MMM yyyy");

	private static final SimpleDateFormat odf = new SimpleDateFormat("yyyyMMdd");

	private static Pattern p;

	static
	{
		String regex = "";
		regex += "<tr id=\"(\\w*?)\">\\s*<td>(\\w*?)</td>\\s*";
		regex += "<td>(.*?)</td>\\s*<td>(.*?)</td>\\s*<td>(.*?)</td>\\s*";
		regex += "<td>(.*?)</td>\\s*<td>(.*?)</td>\\s*</tr>";

		p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	}

	private WebTarget laddTarget;

	@Inject
	public LaddDAOImpl(@Named("ws.ladd") Provider<WebTarget> laddTargetProvider)
	{
		this.laddTarget = laddTargetProvider.get();

		log.debug("instantiated class: {}", this.getClass().getName());
	}

	@Override
	public Map<String, ElasticSearchPartner> getData() throws ClientErrorException
	{
		Map<String, ElasticSearchPartner> data = new TreeMap<String, ElasticSearchPartner>();

		String page = laddTarget.request(MediaType.TEXT_HTML).get(String.class);

		Matcher m = p.matcher(page);
		while (m.find())
		{
			String nuc1 = m.group(1);
			String name = m.group(3);
			String susp = m.group(5);
			String srts = m.group(6);
			String ends = m.group(7);

			ElasticSearchPartner e = new ElasticSearchPartner();
			e.setNuc(nuc1);
			e.setEnabled(true);

			if (name != null && !"".equals(name))
				e.setName(name);

			ElasticSearchSuspension suspension = null;
			if (susp != null && !"".equals(susp))
			{
				if ("not suspended".equals(susp.trim().toLowerCase()))
					e.setStatus(ElasticSearchSuspension.NOT_SUSPENDED);
				else
					e.setStatus(ElasticSearchSuspension.SUSPENDED);

				suspension = new ElasticSearchSuspension();
				suspension.setSuspensionStatus(e.getStatus());
				suspension.setSuspensionStart(formatDate(nuc1, srts));
				suspension.setSuspensionEnd(formatDate(nuc1, ends));

				e.getSuspensions().add(suspension);
			}

			data.put(nuc1, e);
		}

		return data;
	}

	private String formatDate(String nuc, String date)
	{
		String result = null;

		if (date != null && !"".equals(date.trim()))
		{
			try
			{
				Date d = idf.parse(date);
				result = odf.format(d);
			}
			catch (ParseException pe)
			{
				log.warn("can't parse tepuna date[{}]: {}", nuc, date);
			}
		}

		return result;
	}
}

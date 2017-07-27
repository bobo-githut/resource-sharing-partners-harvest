package org.nishen.resourcepartners;

import org.nishen.resourcepartners.util.ILRSScraperUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ResourcePartnerApp
{
	private static final Logger log = LoggerFactory.getLogger(ResourcePartnerApp.class);

	private String[] args = null;

	private ILRSScraperUtil scraper;

	@Inject
	private ResourcePartnerApp(@Named("app.cmdline") final String[] args, ILRSScraperUtil scraper)
	{
		this.args = args;
		this.scraper = scraper;
	}

	public void run()
	{
		log.debug("application execution starting");

		if (args == null || args.length == 0)
		{
			System.out.println("java -jar resource-partners.jar [options]\n");

			return;
		}

		if (log.isDebugEnabled())
			for (String a : args)
				log.debug("cmdline: {}", a);
		
		

		log.debug("application execution complete");
	}
}
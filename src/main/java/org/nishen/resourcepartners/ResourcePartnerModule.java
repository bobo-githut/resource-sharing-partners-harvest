package org.nishen.resourcepartners;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.nishen.resourcepartners.dao.ElasticSearchDAO;
import org.nishen.resourcepartners.dao.ElasticSearchDAOImpl;
import org.nishen.resourcepartners.dao.IlrsDAO;
import org.nishen.resourcepartners.dao.IlrsDAOImpl;
import org.nishen.resourcepartners.dao.LaddDAO;
import org.nishen.resourcepartners.dao.LaddDAOImpl;
import org.nishen.resourcepartners.dao.TepunaDAO;
import org.nishen.resourcepartners.dao.TepunaDAOImpl;
import org.nishen.resourcepartners.harvesters.Harvester;
import org.nishen.resourcepartners.harvesters.HarvesterIlrs;
import org.nishen.resourcepartners.harvesters.HarvesterLadd;
import org.nishen.resourcepartners.harvesters.HarvesterTepuna;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class ResourcePartnerModule extends AbstractModule
{
	private static final Logger log = LoggerFactory.getLogger(ResourcePartnerModule.class);

	private static final String CONFIG_FILE = "app.properties";

	private static final Properties config = new Properties();

	private WebTarget elasticTarget = null;

	private WebTarget ilrsTarget = null;

	private WebTarget laddTarget = null;

	private WebTarget tepunaTarget = null;

	@Override
	protected void configure()
	{
		String configFilename = CONFIG_FILE;
		if (System.getProperty("config") != null)
			configFilename = System.getProperty("config");

		File configFile = new File(configFilename);
		try
		{
			if (!configFile.exists() || !configFile.canRead())
				throw new IOException("cannot read config file: " + configFile.getAbsolutePath());

			config.load(new FileReader(configFile));

			if (log.isDebugEnabled())
				for (String k : config.stringPropertyNames())
					log.debug("{}: {}={}", new Object[] { CONFIG_FILE, k, config.getProperty(k) });
		}
		catch (IOException e)
		{
			log.error("unable to load configuration: {}", configFile.getAbsoluteFile(), e);
			return;
		}

		// bind instances
		bind(ResourcePartnerProcessor.class).to(ResourcePartnerProcessorImpl.class);
		bind(ElasticSearchDAO.class).to(ElasticSearchDAOImpl.class);
		bind(IlrsDAO.class).to(IlrsDAOImpl.class);
		bind(LaddDAO.class).to(LaddDAOImpl.class);
		bind(TepunaDAO.class).to(TepunaDAOImpl.class);
		bind(Harvester.class).annotatedWith(Names.named("harvester.ladd")).to(HarvesterLadd.class);
		bind(Harvester.class).annotatedWith(Names.named("harvester.ilrs")).to(HarvesterIlrs.class);
		bind(Harvester.class).annotatedWith(Names.named("harvester.tepuna")).to(HarvesterTepuna.class);

	}

	@Provides
	@Named("ws.elastic")
	protected WebTarget provideWebTargetElastic()
	{
		if (elasticTarget == null)
		{
			String usr = config.getProperty("ws.url.elastic.username");
			String pwd = config.getProperty("ws.url.elastic.password");
			HttpAuthenticationFeature auth = HttpAuthenticationFeature.basic(usr, pwd);

			Client client = ClientBuilder.newClient().register(auth);
			elasticTarget = client.target(config.getProperty("ws.url.elastic.index"));
		}

		return elasticTarget;
	}

	@Provides
	@Named("ws.ilrs")
	protected WebTarget provideWebTargetIlrs()
	{
		if (ilrsTarget == null)
		{
			Client client = ClientBuilder.newClient();
			ilrsTarget = client.target(config.getProperty("ws.url.ilrs"));
		}

		return ilrsTarget;
	}

	@Provides
	@Named("ws.ladd")
	protected WebTarget provideWebTargetLadd()
	{
		if (laddTarget == null)
		{
			Client client = ClientBuilder.newClient();
			laddTarget = client.target(config.getProperty("ws.url.ladd"));
		}

		return laddTarget;
	}

	@Provides
	@Named("ws.tepuna")
	protected WebTarget provideWebTargetTepuna()
	{
		if (tepunaTarget == null)
		{
			Client client = ClientBuilder.newClient();
			tepunaTarget = client.target(config.getProperty("ws.url.tepuna"));
		}

		return tepunaTarget;
	}
}

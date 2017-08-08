package org.nishen.resourcepartners.dao;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.nishen.resourcepartners.entity.ElasticSearchEntity;
import org.nishen.resourcepartners.entity.ElasticSearchPartner;

public interface ElasticSearchDAO
{
	public Optional<ElasticSearchPartner> getPartner(String id);

	public Map<String, ElasticSearchPartner> getPartners();

	public void addEntity(ElasticSearchEntity esEntity) throws Exception;

	public void addEntities(Collection<? extends ElasticSearchEntity> esEntities) throws Exception;

	public void delEntity(ElasticSearchEntity esEntity) throws Exception;

	public void delEntities(Collection<? extends ElasticSearchEntity> esEntities) throws Exception;
}
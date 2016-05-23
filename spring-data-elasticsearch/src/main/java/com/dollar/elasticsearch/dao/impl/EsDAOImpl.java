package com.dollar.elasticsearch.dao.impl;

import com.dollar.elasticsearch.dao.EsDAO;
import org.elasticsearch.common.settings.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author why
 * Date 16-5-23
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
@Repository
public class EsDAOImpl implements EsDAO{

    private ElasticsearchTemplate elasticsearchTemplate;

    public ElasticsearchTemplate getElasticsearchTemplate() {
        return elasticsearchTemplate;
    }

    @Autowired
    public void setElasticsearchTemplate(ElasticsearchTemplate elasticsearchTemplate) {
        this.elasticsearchTemplate = elasticsearchTemplate;
    }

    @Override
    public boolean createIndex(String indexName) {
        return elasticsearchTemplate.getClient().admin().indices().prepareCreate(indexName)
                .setSettings(Settings.settingsBuilder()
                        .put("number_of_shards", 1)
                        .put("number_of_replicas", 1)
                        .build())
                .execute().actionGet().isAcknowledged();
    }

    @Override
    public boolean deleteIndex(String indexName) {
        return elasticsearchTemplate.deleteIndex(indexName);
    }
}

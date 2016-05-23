package com.dollar;

import com.dollar.elasticsearch.dao.impl.EsDAOImpl;
import org.elasticsearch.common.settings.Settings;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by annali on 5/22/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/conf/spring/ioc-elasticsearch.xml")
public class EsDAOTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    private int numberOfShards = 1;
    private int numberOfReplicas = 1;

    @Autowired
    private EsDAOImpl esDAO;


    @Test
    public void testCreateIndex() {
        boolean flag = esDAO.createIndex("test-20160523");
        Assert.assertTrue("create index fail", flag);
    }

    @Test
    public void testDeleteIndex(){
        boolean flag = esDAO.deleteIndex("test-20160523");
        Assert.assertTrue("delete index fail", flag);
    }

    private boolean createIndexIfNotCreated(String indexName) {
        if (!elasticsearchTemplate.indexExists(indexName)) {
            return createIndex(indexName, numberOfShards, numberOfReplicas);
        }
        return true;
    }

    private boolean createIndex(String indexName, int numberOfShards, int numberOfReplicas) {
        return elasticsearchTemplate.getClient().admin().indices().prepareCreate(indexName)
                .setSettings(Settings.settingsBuilder()
                        .put("number_of_shards", numberOfShards)
                        .put("number_of_replicas", numberOfReplicas)
                        .build())
                .execute().actionGet().isAcknowledged();
    }


}

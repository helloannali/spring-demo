package com.dollar;

import org.elasticsearch.common.settings.Settings;
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
@ContextConfiguration("classpath:/ioc-elasticsearch.xml")
public class BookRepositoryTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    private int numberOfShards = 1;
    private int numberOfReplicas = 1;


    @Test
    public void test() {

        createIndexIfNotCreated("hello-test-1");
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

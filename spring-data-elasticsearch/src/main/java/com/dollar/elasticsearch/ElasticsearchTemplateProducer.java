package com.dollar.elasticsearch;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Created by annali on 5/22/16.
 */
public class ElasticsearchTemplateProducer {

    public ElasticsearchOperations createElasticsearchTemplate(){
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }
}

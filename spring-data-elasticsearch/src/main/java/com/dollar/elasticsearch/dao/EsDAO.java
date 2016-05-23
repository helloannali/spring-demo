package com.dollar.elasticsearch.dao;

/**
 * Author why
 * Date 16-5-23
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public interface EsDAO {

    boolean createIndex(String indexName);

    boolean deleteIndex(String indexName);
}

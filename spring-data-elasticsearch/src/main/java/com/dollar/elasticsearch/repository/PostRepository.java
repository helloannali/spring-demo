package com.dollar.elasticsearch.repository;

import com.dollar.elasticsearch.entity.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Author why
 * Date 16-5-23
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public interface PostRepository extends ElasticsearchRepository<Post, String> {

    List<Post> findAll();

    Post findById(String id);

    List<Post> findByTitle(String title);

    List<Post> findByTagsName(String name);

    String deleteById(String id);
}

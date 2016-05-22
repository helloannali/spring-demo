package com.dollar.elasticsearch.repository;

import com.dollar.elasticsearch.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by annali on 5/22/16.
 */
public interface BookRepository<Book, String extends Serializable> extends ElasticsearchRepository<Book, String> {

}

package com.dollar.elasticsearch;

import com.dollar.elasticsearch.entity.Person;
import org.elasticsearch.common.inject.Inject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by annali on 5/22/16.
 */
public class ProductService {

    private PersonRepository repository;

    @Inject
    public void setRepository(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> findByLastnameIgnoreCase(String lastname){
        List<Person> list = findByLastnameIgnoreCase(lastname);
        return list;
    }

}

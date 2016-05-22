package com.dollar.elasticsearch;

import com.dollar.elasticsearch.entity.Person;
import org.elasticsearch.repositories.Repository;

import java.util.List;

/**
 * Created by annali on 5/22/16.
 */
public interface PersonRepository extends Repository {

    List<Person> findByLastname(String lastname);
}

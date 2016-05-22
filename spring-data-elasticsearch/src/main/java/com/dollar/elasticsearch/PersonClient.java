package com.dollar.elasticsearch;

import com.dollar.elasticsearch.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by annali on 5/22/16.
 */
public class PersonClient {

    @Autowired
    private PersonRepository personRepository;

    public void find(){
        List<Person> persons = personRepository.findByLastname("anna");
    }
}

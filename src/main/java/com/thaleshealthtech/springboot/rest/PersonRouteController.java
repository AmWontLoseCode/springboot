package com.thaleshealthtech.springboot.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.thaleshealthtech.springboot.exceptions.HealthCheckNotFoundException;
import com.thaleshealthtech.springboot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class Person {
    @Autowired
    private PersonService personService;


    @ResponseBody
    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public Person createPerson(RequestBody Person person) {
        return personService.createPerson(person);
    }
}

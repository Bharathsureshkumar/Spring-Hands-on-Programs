package com.jdbc.jdbc.controller;

import com.jdbc.jdbc.dao.Person;
import com.jdbc.jdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String SayHello(){
        return "Application is running .. !";
    }

    @RequestMapping("/allpersons")
    public List<Person> getPersons(){
        return personService.findAll();
    }

    @GetMapping("/allpersons/{id}")
    public Person getPerson(@PathVariable int id){
        System.out.println("ID : " + id);
        return personService.getPerson(id);
    }

    @GetMapping("/allpersons/delete/{id}")
    public String deletePerson(@PathVariable int id){
        personService.deletePerson(id);
        return "Deleted  : "  + id;
    }

    @PostMapping("/allpersons/add")
    public void addUser(@RequestBody Person person){
        personService.addPerson(person);
    }

}

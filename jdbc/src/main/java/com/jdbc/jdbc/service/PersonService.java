package com.jdbc.jdbc.service;

import com.jdbc.jdbc.dao.Person;
import com.jdbc.jdbc.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public List<Person> findAll(){
      return personDao.getPersons();
    }

    public Person getPerson(int id) {
        return personDao.getPerson(id);
    }

    public void deletePerson(int id){

        personDao.deletePerson(id);
    }

    public void addPerson(Person person) {
        personDao.addPerson(person);
    }
}

package com.jdbc.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class PersonDao {
    @Autowired
    JdbcTemplate jdbc;


    //Custom Row Mapper
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();

            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setDate(rs.getTimestamp("birth_date"));
            return person;
        }
    }

    // End of Custom Row Mapper .. !





    public List<Person> getPersons(){
//        return jdbc.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<Person>(Person.class));
        return jdbc.query("SELECT * FROM PERSON", new PersonRowMapper());  //Custom Row Mapper .. !
    }


    public Person getPerson(int id){
        return jdbc.queryForObject("select * from person where id=?",new Object[] {id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public void deletePerson(int id){
        jdbc.update("delete from Person where id=?", new Object[] {id});
    }


    public void addPerson(Person person) {
        jdbc.update("INSERT INTO PERSON(id,name,birth_date,location) VALUES(?, ?, ?, ?)",
                new Object[] {person.getId(), person.getName(), person.getDate(), person.getLocation()});
    }
}

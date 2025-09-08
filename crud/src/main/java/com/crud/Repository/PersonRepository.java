package com.crud.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Person;



@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}

package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Girls;
import com.crud.Model.Person;



@Repository
public interface GirlsRepository extends JpaRepository<Girls, Integer>{

}
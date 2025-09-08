package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Cars;


@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer>{

}

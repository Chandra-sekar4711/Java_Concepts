package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Addressmodel;

@Repository
public interface AddressRepository extends JpaRepository<Addressmodel, Integer> {
}

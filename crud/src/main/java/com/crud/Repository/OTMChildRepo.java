package com.crud.Repository;

import com.crud.Model.OTMChild;
import com.crud.Model.OTMParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Addressmodel;

@Repository
public interface OTMChildRepo extends JpaRepository<OTMChild, Integer> {
}

package com.crud.Repository;

import com.crud.Model.OTMParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.Addressmodel;

@Repository
public interface OTMParentRepo extends JpaRepository<OTMParent, Integer> {
}

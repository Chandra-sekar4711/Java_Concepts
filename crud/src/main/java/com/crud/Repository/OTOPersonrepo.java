package com.crud.Repository;

import com.crud.Model.OTOPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OTOPersonrepo extends JpaRepository<OTOPerson,Integer> {
}

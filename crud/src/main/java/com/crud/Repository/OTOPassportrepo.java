package com.crud.Repository;

import com.crud.Model.OTOPassport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OTOPassportrepo extends JpaRepository<OTOPassport,Integer> {

}

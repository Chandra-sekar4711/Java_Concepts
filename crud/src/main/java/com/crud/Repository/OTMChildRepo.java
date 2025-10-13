package com.crud.Repository;

import com.crud.Model.OTMChild;
import com.crud.Model.OTMParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.Model.Addressmodel;

@Repository
public interface OTMChildRepo extends JpaRepository<OTMChild, Integer> {

    @Query("SELECT c FROM OTMChild c  WHERE c.cid = :id")
    OTMChild fetchbyJoinfetch(@Param("id") Integer id);

}

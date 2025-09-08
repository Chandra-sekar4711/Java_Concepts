package com.crud1.Repository;

import com.crud1.Model.OTMBoys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OTMRepo extends JpaRepository<OTMBoys,Integer> {

    @Query("SELECT ob FROM OTMBoys ob  join ob.girls_fk og where ob.bid =:id AND og.gage = :age")
    OTMBoys findByIDS(String id, String age);
}

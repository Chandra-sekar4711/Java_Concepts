package com.crud1.Repository;

import com.crud1.Model.OTMBoys;
import com.crud1.Model.OTMParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OTMParentRepo extends JpaRepository<OTMParent,Integer> {
}

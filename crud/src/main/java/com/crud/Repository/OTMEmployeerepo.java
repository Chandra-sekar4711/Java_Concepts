package com.crud.Repository;

import com.crud.Model.OTMEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTMEmployeerepo extends JpaRepository<OTMEmployee,Integer> {
}

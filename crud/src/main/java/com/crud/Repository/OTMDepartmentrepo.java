package com.crud.Repository;

import com.crud.Model.OTMDepartment;
import com.crud.Model.OTMEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTMDepartmentrepo extends JpaRepository<OTMDepartment,Integer> {
}

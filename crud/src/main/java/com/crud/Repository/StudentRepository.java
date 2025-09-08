package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crud.Model.StudentModel;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

	 @Transactional
	   @Query("SELECT s FROM StudentModel s WHERE s.sname = :sname AND s.sphno = :sphno")
	    public StudentModel getdata(@Param("sname") String sname, @Param("sphno") int sphno);
	}

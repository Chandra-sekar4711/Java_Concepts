package com.crud.Service;

import java.util.List;
import java.util.Optional;

import com.crud.Model.StudentModel;

public interface StudentService {

	public StudentModel SaveUser(StudentModel sm);
    public List<StudentModel> getAllStudents();
	
	public Optional<StudentModel> getonedata(Integer id) throws IllegalArgumentException;
	
	
	public StudentModel Update(Integer id, StudentModel student)throws IllegalArgumentException;
	public StudentModel Delete( StudentModel student)throws IllegalArgumentException;
	
}

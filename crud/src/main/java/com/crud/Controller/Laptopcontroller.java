package com.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Model.Laptopmodel;
import com.crud.Model.StudentModel;
import com.crud.Repository.LaptopRepository;
import com.crud.Service.StudentService;
@RestController
public class Laptopcontroller {
	
	@Autowired
	LaptopRepository laprepo;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/CreateLaptop", method = RequestMethod.POST)
	public Laptopmodel Create(@RequestBody Laptopmodel lm)
	{
		return laprepo.save(lm);
	}
	}
	

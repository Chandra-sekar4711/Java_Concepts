package com.crud.Controller;

import java.util.*;
import java.util.Optional;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crud.CustomException.Student_NotRegister_Exception;
import com.crud.Model.StudentModel;
import com.crud.Service.StudentService;
@RestController
public class StudentController {
	
	@Autowired
	StudentService StudentService;
	
	 private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	 @GetMapping("/chatResponse")
	 public ResponseEntity<Map<String, String>> chatResponse(@RequestParam(required = false) String query) {
	     System.out.println("Received message: " + query);
	     Map<String, String> response = new HashMap<>();

	     // Validate input
	     if (query == null || query.trim().isEmpty()) {
	         response.put("error", "Message cannot be empty");
	         return ResponseEntity.badRequest().body(response);
	     }

	     // Convert to lowercase for case-insensitive image checks
	     String lowerMessage = query.toLowerCase();
	     
	     if (lowerMessage.endsWith(".jpg") || lowerMessage.endsWith(".jpeg") || lowerMessage.endsWith(".png")) {
//	         response.put("message", "Here is your image");
	         response.put("imageUrl", "http://localhost:8080/images/" + query);
	     } else {
	         response.put("message", query);
	     }

	     System.out.println("Response: " + response);
	     return ResponseEntity.ok(response);
	 }

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/Create", method = RequestMethod.POST)
	public ResponseEntity<StudentModel> Create(@RequestBody StudentModel sm)
	{
		StudentModel res=StudentService.SaveUser(sm);
		System.out.println(res);
		return new ResponseEntity<>(res, HttpStatus.CREATED);
		//return ResponseEntity.ok(res);
		
	}
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/Getuser", method = RequestMethod.GET)	
	 public ResponseEntity<List<StudentModel>> getAllStudents() {
	        List<StudentModel> students = StudentService.getAllStudents();
	        return new ResponseEntity<>(students, HttpStatus.CREATED);
	        //return ResponseEntity.ok(students);
	    }
	
	

	@RequestMapping(value = "/Getuser/{id}", method = RequestMethod.GET)
	public ResponseEntity<StudentModel> getOneData(@PathVariable("id") Integer id) {
	    Optional<StudentModel> student = StudentService.getonedata(id);
	    System.out.println(student);
	    return new ResponseEntity<>(student.get(), HttpStatus.OK);
	}

	   @RequestMapping(value = "/Update/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<StudentModel> Update(@PathVariable("id") Integer id,@RequestBody StudentModel student) {
		  try {
			  StudentModel up=StudentService.Update(id, student);
		       return new ResponseEntity<>(up, HttpStatus.OK);
		  }
		  catch(IllegalArgumentException ia)
		  {
			  System.out.println("Error happened: " + ia.getMessage());
			  return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  }
	    }
	
	   
	   //to check whether the user is there or not to delete
	   
	   
	   @RequestMapping(value="/Delete",method =  RequestMethod.DELETE)
	   public ResponseEntity<StudentModel> Delete(@RequestBody StudentModel student)
	   {
		   try {
		   StudentModel du=StudentService.Delete(student);
		   return new ResponseEntity<>(HttpStatus.OK);   
		   }
		   catch(IllegalArgumentException ee)
		   {
			   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		   }
				   
	
		   
	   }

	
	
}

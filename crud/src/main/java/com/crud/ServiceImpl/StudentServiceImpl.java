package com.crud.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.CustomException.Student_NotRegister_Exception;
import com.crud.Model.Addressmodel;
import com.crud.Model.Laptopmodel;
import com.crud.Model.StudentModel;
import com.crud.Service.StudentService;
import com.crud.Repository.AddressRepository;
import com.crud.Repository.LaptopRepository;
import com.crud.Repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository StudentRepository;
	
	@Autowired
	LaptopRepository laptopRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public StudentModel SaveUser(StudentModel sm) {
	    System.out.println(sm); // Logging for debugging

	    // Handle Addressmodel
	    Addressmodel address = sm.getAddress();
	    System.out.println(address);
	    if (address != null) {
	        if (address.getAid() == 0) {
	            // New Address: Save it first
	            address = addressRepository.save(address);
	            sm.setAddress(address);
	        } else {
	            // Existing Address: Fetch it from the database
	            address = addressRepository.findById(address.getAid())
	                    .orElseThrow(() -> new RuntimeException("Address not found with ID: "));
	            sm.setAddress(address); // Attach the fetched Addressmodel
	        }
	    }
         System.out.println("before-->"+""+sm);
	    // Handle Laptopmodel (optional)
	    Laptopmodel laptop = sm.getLid_FK();
	    if (laptop != null) {
	      
	            laptop = laptopRepository.findById(laptop.getLid())
	                    .orElseThrow(() -> new RuntimeException("Laptop not found with ID: " ));
	            sm.setLid_FK(laptop); // Attach the fetched Laptopmodel
	        
	    }
	    System.out.println("after-->"+""+sm);
	    // Save the StudentModel
	    return StudentRepository.save(sm);
	}

	
	@Override
	public  List<StudentModel> getAllStudents() {
		return StudentRepository.findAll();
		
	}

	@Override
	public Optional<StudentModel> getonedata(Integer id) throws Student_NotRegister_Exception {
	    Optional<StudentModel> student = StudentRepository.findById(id);
	    System.out.println(student);
	    if (!student.isPresent()) {
	        throw new Student_NotRegister_Exception("Student not found with id: " + id);
	    }
	    return student;
	}

	@Override
	public StudentModel Update(Integer id,StudentModel student){
		  Optional<StudentModel> sd = StudentRepository.findById(id);
		  if(sd.isPresent())
		  {
			  StudentModel su=sd.get();
//			  su.setSid(student.getSid());
			  su.setSname(student.getSname());
			  su.setSmark(student.getSmark());
			  su.setSdept(student.getSdept());
			  su.setSphno(student.getSphno());			 
			  return StudentRepository.save(su);
		  }
		
		  else {
			  throw new IllegalArgumentException("No such"+id+" data is there");
		  }
	}

	@Override
	public StudentModel Delete( StudentModel student) throws IllegalArgumentException{
		System.out.println("**********"+student);
		StudentModel sd=StudentRepository.getdata(student.getSname(),student.getSphno());
		System.out.println("**********"+sd);
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getSphno());
		System.out.println("**********"+sd);
		
		if(sd==null)
		{
			throw new IllegalArgumentException("Database is Empty ");
		}
		else {
			StudentRepository.deleteById(sd.getSid());
			
			return sd;
		}
		
		
		
		
	}

	
	
	
	

}

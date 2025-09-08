package com.crud.Controller;

import java.util.Optional;
import java.util.Set;

import com.crud.Model.OTMParent;
import com.crud.Repository.OTMParentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.Model.Cars;
import com.crud.Model.Person;
import com.crud.Model.StudentModel;
import com.crud.Repository.CarsRepository;
import com.crud.Repository.PersonRepository;
import com.crud.Service.StudentService;

//one person many cars
//Realnamehiddentutorial
@RestController
public class Onetomanycontroller {
	
	@Autowired
	CarsRepository carrepo;
	
	@Autowired
	PersonRepository personrepo;

	@Autowired
	OTMParentRepo otmparentrepo;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/Onetomany", method = RequestMethod.POST)
	public ResponseEntity<Person> Onetomany(@RequestBody Person sm)
	{
	  System.out.println(sm);   
		personrepo.save(sm);
		
		
		return new ResponseEntity<Person>(sm, HttpStatus.CREATED);
		//return ResponseEntity.ok(res);
		
	}
	
	
	@RequestMapping(value = "/Onetomanyfetch/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> Onetomanyfetch(@PathVariable("id") Integer id) {
		 Optional<Person> personOpt = personrepo.findById(id);
		   Person pobj=personOpt.get();		
		    if (personOpt.isPresent()) {
		    	if(id==2)
		    	{
		    	Set<Cars> cars= pobj.getCars();
		    	  return new ResponseEntity<>(cars, HttpStatus.OK);
		 	    }
		        return new ResponseEntity<>(pobj, HttpStatus.OK);  // Return the found person with 200 OK
		    } else {
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);  // Return 404 if not found
		    }
       
		
        }

		@PostMapping("/postparent")
		public OTMParent saveparent(@RequestBody OTMParent parobj)
		{
			parobj.getChild_fk().forEach(n->n.setOtmparent(parobj));
			OTMParent res =  otmparentrepo.save(parobj);
			System.out.println(res);
			return res;

		}


    }


package com.crud.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Model.Boys;
import com.crud.Model.Person;
import com.crud.Repository.BoysRepository;

//Realnamehiddentutorial

@RestController
public class ManytomanyConroller {
	
	@Autowired
	BoysRepository brepo;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/Manytomany", method = RequestMethod.POST)
	public ResponseEntity<Boys> Manytomany(@RequestBody Boys bs)
	{
	  System.out.println(bs);   
		brepo.save(bs);
		
		
		return new ResponseEntity<Boys>(bs, HttpStatus.CREATED);
		//return ResponseEntity.ok(res);
		
	}

	@RequestMapping(value = "/boys/{boyid}", method = RequestMethod.GET)
	public ResponseEntity<Boys> getBoys(@PathVariable("boyid") Integer boyid) {
	    Optional<Boys> boysOpt = brepo.findById(boyid);

	    if (boysOpt.isPresent()) {
	        return new ResponseEntity<>(boysOpt.get(), HttpStatus.OK); // Return Boys with associated Girls
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if Boys not found
	    }
	}

}

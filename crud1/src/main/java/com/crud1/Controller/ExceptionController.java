package com.crud1.Controller;

import com.crud1.CustomException.MyException;
import com.crud1.Model.OTMBoys;
import com.crud1.Service.OTMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ExceptionController {

   final OTMService otmservice;

    @Autowired

    public ExceptionController(OTMService otmservice)
    {
        this.otmservice = otmservice;
    }

    @PostMapping("/saveboyss")
    public ResponseEntity<?> Exceptionhandling(@RequestBody OTMBoys otmboys )
    {
        OTMBoys obj = null;
         try {
              obj = otmservice.otmsave(otmboys);
         }
         catch(NullPointerException ne)
         {
             return new ResponseEntity<>("Nullpointer Exception Caught", HttpStatus.INTERNAL_SERVER_ERROR);
    }
         catch (ArithmeticException e) {
             return new ResponseEntity<>("Arithmetic Exception Caught", HttpStatus.INTERNAL_SERVER_ERROR);
         }
         catch (MyException e) {
             throw new MyException("Controller MyExcption");
         }
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }


}

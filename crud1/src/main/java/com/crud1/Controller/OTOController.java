package com.crud1.Controller;

import com.crud1.Model.OTOPerson;
import com.crud1.Service.OTOService;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/crud1")
public class OTOController {

    @Autowired
    OTOService otoservice;

    @PostMapping("/testapi")
    @Operation(summary = "testapi")
    public String Testapi()
    {
        return "Test api";
    }

    @PostMapping("OTOPersonpassport")
    @Operation(summary = "Post the person")
    public OTOPerson save_OTOPersonpassport(@RequestBody OTOPerson otoperson)
    {
        OTOPerson res =  otoservice.saveOTOPerson(otoperson);
        return res;
    }

    @GetMapping("/getOTOPersonByID/{personID}")
    @Operation(summary = "Get Person By ID")
    private ResponseEntity<OTOPerson> getOTOPersonByID(@PathVariable Integer personID)
    {
        OTOPerson res = otoservice.getOTOPersonById(personID);
        return new ResponseEntity<>(res,HttpStatus.ALREADY_REPORTED );

    }

}


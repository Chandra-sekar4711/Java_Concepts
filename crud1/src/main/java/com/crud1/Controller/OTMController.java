package com.crud1.Controller;

import com.crud1.CustomException.MyException;
import com.crud1.Model.ModelBO.OTMParentBO;
import com.crud1.Model.OTMBoys;
import com.crud1.Model.OTMParent;
import com.crud1.Service.OTMService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/crud1")
public class OTMController {

    @Autowired
    OTMService otmservice;

    @PostMapping("/saveboy")
    public OTMBoys otmsave(@RequestBody OTMBoys otmboys) throws MyException {
        OTMBoys obj = otmservice.otmsave(otmboys);
        return obj;
    }

    @GetMapping("/getboys/{id}")
    public OTMBoys getBoysByid(@PathVariable Integer id)
    {
        OTMBoys obj = otmservice.getBoysByid(id);
        return obj;
    }

    @PostMapping("/getboysandgirls")
    public OTMBoys getboysandgirls(@RequestBody Map<String,String> request)
    {
        OTMBoys res = otmservice.getboysandgirls(request);
        return res;
    }

    @PostMapping("/updateboys")
    public OTMBoys updateBoysByid(@RequestBody OTMBoys otmboys)
    {
        OTMBoys res = otmservice.updateBoysbyID(otmboys);
        return res;
    }

    @DeleteMapping("/Deleteboys/{id}")
    public void Deleteboys(@PathVariable Integer id)
    {
        otmservice.Deleteboys(id);
    }

    //*********************************Save parent and child OTM*****************************************

    @PostMapping("/saveparent")
    public OTMParentBO saveparent(@RequestBody OTMParentBO otmparent)
    {
        OTMParentBO res = otmservice.saveparent(otmparent);
        return res;
    }


    @GetMapping("/getparents/{id}")
    public OTMParent getParentsByid(@PathVariable Integer id)
    {
        OTMParent obj = otmservice.getParentsByid(id);
        return obj;
    }


}

package com.crud1.Serviceimpl;

import com.crud1.Model.OTOPerson;
import com.crud1.Repository.OTOPersonRepo;
import com.crud1.Service.OTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OTOserviceimpl implements OTOService {

   @Autowired
   OTOPersonRepo otorepo;

    @Override
    public OTOPerson saveOTOPerson(OTOPerson otoperson) {
        otoperson.getPassport().setPerson(otoperson);
        return otorepo.save(otoperson);
    }

    @Override
    public OTOPerson getOTOPersonById(Integer personID) {
        return otorepo.findById(personID).get();
    }
}

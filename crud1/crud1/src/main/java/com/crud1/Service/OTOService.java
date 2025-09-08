package com.crud1.Service;

import com.crud1.Model.OTOPerson;
import org.springframework.stereotype.Service;

@Service
public interface OTOService {

    OTOPerson saveOTOPerson(OTOPerson otoperson);

    OTOPerson getOTOPersonById(Integer personID);
}

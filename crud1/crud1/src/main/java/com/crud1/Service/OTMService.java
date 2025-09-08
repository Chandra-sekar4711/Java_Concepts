package com.crud1.Service;

import com.crud1.CustomException.MyException;
import com.crud1.Model.ModelBO.OTMParentBO;
import com.crud1.Model.OTMBoys;
import com.crud1.Model.OTMParent;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface OTMService {

    OTMBoys otmsave(OTMBoys otmboys) throws ArithmeticException, NullPointerException, MyException;

    OTMBoys getBoysByid(Integer id);

    OTMBoys updateBoysbyID(OTMBoys otmboys);

    void Deleteboys(Integer id);

    OTMParentBO saveparent(OTMParentBO otmparent);

    OTMParent getParentsByid(Integer id);

    OTMBoys getboysandgirls(Map<String,String> request);
}

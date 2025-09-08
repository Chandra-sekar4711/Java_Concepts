package com.crud1.GolbalExceptionHandler;

import com.crud1.CustomException.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(MyException.class)
    public Map<String,Object> MyException(MyException me)
    {
        Map<String,Object> hm = new HashMap();
        hm.put("Error :","GLOBAL "+me.getMessage());
        hm.put("Status code :", HttpStatus.BAD_REQUEST);
        return hm;
    }


}

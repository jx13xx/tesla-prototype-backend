package com.rak.teslaprototype.dto;


import java.util.HashMap;
import java.util.Map;

public class ResponseDto {

    public Map<String, Object> convertToResponse (Object response){
        Map<String, Object> cp = new HashMap<>();
        cp.put("data", response);
        return  cp;
    }
}

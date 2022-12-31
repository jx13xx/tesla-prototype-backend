package com.rak.teslaprototype.dto;

import java.util.HashMap;

public class ResponseDtoImpl   {

    public Object convertToResponse (Object response){
        HashMap<Object, Object> convertedResponse = new HashMap<>();
        return convertedResponse.put("data", response);
    }
}

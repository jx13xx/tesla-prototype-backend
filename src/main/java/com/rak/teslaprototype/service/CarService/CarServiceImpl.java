package com.rak.teslaprototype.service.CarServiceAPI;

import com.rak.teslaprototype.dto.ResponseDto;
import com.rak.teslaprototype.repository.CarRepository;
import com.rak.teslaprototype.service.CarServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class CarServiceImpl implements CarServiceAPI {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Map<String, Object> getAllCars() {
        var response = carRepository.findAll();
        ResponseDto convertResponse = new ResponseDto();
        return convertResponse.convertToResponse(response);
    }

    @Override
    public Map<String, Object> getSpecs(String id) {
        return null;
    }
}

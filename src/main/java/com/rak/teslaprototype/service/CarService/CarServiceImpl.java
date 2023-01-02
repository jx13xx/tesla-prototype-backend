package com.rak.teslaprototype.service.CarService;

import com.rak.teslaprototype.constants.ErrorMessage;
import com.rak.teslaprototype.constants.Key;
import com.rak.teslaprototype.dto.ResponseDto;
import com.rak.teslaprototype.exceptions.AutoPilotNotFoundException;
import com.rak.teslaprototype.exceptions.ExertiorNotFoundException;
import com.rak.teslaprototype.exceptions.FeatureNotFoundException;
import com.rak.teslaprototype.exceptions.InteriorNotFoundException;
import com.rak.teslaprototype.model.*;
import com.rak.teslaprototype.repository.CarRepository;
import com.rak.teslaprototype.service.CarServiceAPI;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CarServiceImpl implements CarServiceAPI {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Object getAllCars() {
        List<Car> cars = carRepository.findAll();
        return convertToDto(cars);
    }

    @SneakyThrows
    @Override
    public Object getFeatures(String id) {
        List<Car> cars = carRepository.findAllById(Long.valueOf(id));

        if(cars.isEmpty())
           throw  new FeatureNotFoundException(ErrorMessage.CAR_NOT_FOUND);

       List<Feature> features = cars.stream().flatMap(
               car -> car.getFeatures().stream()).collect(Collectors.toList());

        return convertToDto(features);
    }

    @SneakyThrows
    @Override
    public Object getInterior(String id) {
        List<Car> cars = carRepository.findAllById(Long.valueOf(id));

        if(cars.isEmpty())
            throw  new InteriorNotFoundException(ErrorMessage.CAR_NOT_FOUND);


        List<CarInterior> features = cars.stream().flatMap(
                car -> car.getInteriors().stream()).collect(Collectors.toList());

        return convertToDto(responseModifier(Key.CAR_ID.key, id, "interior_features", features ));
    }

    @SneakyThrows
    @Override
    public Object getExterior(String id) {
        List<Car> cars = carRepository.findAllById(Long.valueOf(id));

        if(cars.isEmpty())
            throw new ExertiorNotFoundException(ErrorMessage.CAR_NOT_FOUND);

        List<Color> features = cars.stream().flatMap(
                car -> car.getColors().stream()).collect(Collectors.toList());

        return convertToDto(responseModifier(Key.CAR_ID.key, id, "colors", features ));
    }

    @SneakyThrows
    @Override
    public Object getAutoPilotSpecs(String id) {
        List<Car> cars = carRepository.findAllById(Long.valueOf(id));

        if(cars.isEmpty())
            throw new AutoPilotNotFoundException(ErrorMessage.CAR_NOT_FOUND);

        List<AutoPilot> features = cars.stream().flatMap(
                car -> car.getAutoPilots().stream()).collect(Collectors.toList());

        return convertToDto(responseModifier(Key.CAR_ID.key, id, "autopilot_options", features ));
    }

    private Object convertToDto (Object response){
        ResponseDto convertResponse = new ResponseDto();
        return convertResponse.convertToResponse(response);
    }


    private HashMap<String, Object> responseModifier (String key1, Object value1, String key2, Object value2){
        HashMap<String, Object> object = new HashMap<>();
        object.put(key1,value1);
        object.put(key2,value2);
        return object;
    }
}

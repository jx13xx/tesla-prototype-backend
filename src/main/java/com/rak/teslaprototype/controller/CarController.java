package com.rak.teslaprototype.controller;

import com.rak.teslaprototype.service.CarServiceAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("api/v1/car")
@Slf4j
public class CarController {

    public final CarServiceAPI api;


    public CarController(CarServiceAPI carServiceAPI) {
        this.api = carServiceAPI;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getAll()  {
        log.info("Retrieving all cars");
        return new ResponseEntity<>(api.getAllCars(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/features", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getFeatures(@PathVariable String id) {
        log.info("Retrieving car feature options");
        return new ResponseEntity<>(api.getFeatures(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/interior", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getInterior(@PathVariable String id){
        log.info("Retrieving car interior options");
        return new ResponseEntity<>(api.getInterior(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/exterior", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getExterior(@PathVariable String id){
        log.info("Retrieving car exterior options");
        return new ResponseEntity<>(api.getExterior(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/autopilot", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getAutoPilot(@PathVariable String id){
        log.info("Retrieving car autopilot options");
        return new ResponseEntity<>(api.getAutoPilotSpecs(id), HttpStatus.OK);
    }


}

package com.rak.teslaprototype.service;



import java.util.Map;


public interface CarServiceAPI {

    /**
     * Get Specifications items such has speed, exterior specs of the car
     */
    Map<String, Object> getAllCars();

    /**
     * Get Car feature specifications items such has speed, exterior specs of the car
     *
     * @param id, refers to the unique identifier for the car
     */

    Map<String, Object> getFeatures(String id);

    /**
     * Get Car interior specifications items such has color seat color
     *
     * @param id, refers to the unique identifier for the car
     */
    Map<String, Object> getInterior(String id);


    /**
     * Get Car exterior specifications items such has color specifications of the car
     *
     * @param id, refers to the unique identifier for the car
     */
    Map<String, Object> getExterior(String id);

    /**
     * Get Car autopilot specifications items such has self-driving or other features of the car
     *
     * @param id, refers to the unique identifier for the car
     */
    Map<String, Object> getAutoPilotSpecs(String id);


}

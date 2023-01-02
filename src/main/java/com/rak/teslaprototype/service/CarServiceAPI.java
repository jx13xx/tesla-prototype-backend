package com.rak.teslaprototype.service;



import java.util.Map;


public interface CarServiceAPI {

    /**
     * Get Specifications items such has speed, exterior specs of the car
     */
    Object getAllCars();

    /**
     * Get Car feature specifications items such has speed, exterior specs of the car
     *
     * @param id, refers to the unique identifier for the car
     */

    Object getFeatures(String id);

    /**
     * Get Car interior specifications items such has color seat color
     *
     * @param id, refers to the unique identifier for the car
     */
    Object getInterior(String id);


    /**
     * Get Car exterior specifications items such has color specifications of the car
     *
     * @param id, refers to the unique identifier for the car
     */
    Object getExterior(String id);

    /**
     * Get Car autopilot specifications items such has self-driving or other features of the car
     *
     * @param id, refers to the unique identifier for the car
     * @return
     */
    Object getAutoPilotSpecs(String id);


}

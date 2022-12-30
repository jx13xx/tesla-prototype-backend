package com.rak.teslaprototype;

import com.rak.teslaprototype.model.Car;
import com.rak.teslaprototype.model.Cost;
import com.rak.teslaprototype.repository.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TeslaPrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeslaPrototypeApplication.class, args);
    }

}

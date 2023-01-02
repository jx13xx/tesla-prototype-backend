package com.rak.teslaprototype.service;

import com.rak.teslaprototype.builder.CarBuilder;
import com.rak.teslaprototype.defaultData.DefaultAutoPilot;
import com.rak.teslaprototype.defaultData.DefaultCarInterior;
import com.rak.teslaprototype.defaultData.DefaultCost;
import com.rak.teslaprototype.exceptions.AutoPilotNotFoundException;
import com.rak.teslaprototype.exceptions.ExertiorNotFoundException;
import com.rak.teslaprototype.exceptions.FeatureNotFoundException;
import com.rak.teslaprototype.exceptions.InteriorNotFoundException;
import com.rak.teslaprototype.model.Car;
import com.rak.teslaprototype.repository.CarRepository;
import com.rak.teslaprototype.service.CarService.CarServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class TestCarService {

    List<Car> cars = new ArrayList<>();
    Car car1 = new CarBuilder().build();
    Car car2 = new CarBuilder().build();

    @Mock
    private CarRepository carRepository;

   @InjectMocks
    private CarServiceImpl carService = new CarServiceImpl();

   @BeforeEach
   public void setUp(){
       this.cars.add(this.car1);
       this.cars.add(this.car2);
   }

   @Test
   public void getAllCarsService() {
       when(carRepository.findAll()).thenReturn(cars);
       var serviceMethod = carService.getAllCars();

       assert serviceMethod != null;
//       assert serviceMethod.getOrDefault("data", DefaultCar.ModelName) != null;
//       for (Map.Entry<String, Object> entry : serviceMethod.entrySet()) {
//           if(entry.getKey().contains("modelName")){
//               assert entry.getValue() == DefaultCar.ModelName;
//               break;
//           }
//       }
   }
   @Test
   public void getFeatures(){

       List<Car> newCar = new ArrayList<>();
       newCar.add(car1);
       when(carRepository.findAllById(car1.getId())).thenReturn(newCar);
       var serviceMethod = carService.getFeatures(String.valueOf(car1.getId()));

       assert serviceMethod != null;
       assert car1.getInteriors().get(0).getDescription() == DefaultCarInterior.Description;
   }
   @Test(expected = FeatureNotFoundException.class)
   public void shouldThrowFeatureNotFoundException() {
       Long carId = new Random().nextLong();

        when(carRepository.findAllById(anyLong())).thenReturn(cars);
        var serviceMethod = carService.getFeatures(String.valueOf(carId));
        assert serviceMethod == null;
   }

    @Test
    public void getInteriors(){

        List<Car> newCar = new ArrayList<>();
        newCar.add(car1);
        when(carRepository.findAllById(car1.getId())).thenReturn(newCar);
        var serviceMethod = carService.getFeatures(String.valueOf(car1.getId()));

        assert serviceMethod != null;
        assert car1.getInteriors().get(0).getDescription() == DefaultCarInterior.Description;
    }

    @Test(expected = InteriorNotFoundException.class)
    public void shouldThrowInteriorNotFoundExceptions() {
        Long carId = new Random().nextLong();

        when(carRepository.findAllById(anyLong())).thenReturn(cars);
        var serviceMethod = carService.getInterior(String.valueOf(carId));
        assert serviceMethod == null;
    }

    @Test
    public void getExterior(){

        List<Car> newCar = new ArrayList<>();
        newCar.add(car1);
        when(carRepository.findAllById(car1.getId())).thenReturn(newCar);
        var serviceMethod = carService.getExterior(String.valueOf(car1.getId()));

        assert serviceMethod != null;
        assert car1.getCost().getPrice() == DefaultCost.Price;
    }

    @Test(expected = ExertiorNotFoundException.class)
    public void shouldThrowExterioNotFoundException() {
        Long carId = new Random().nextLong();

        when(carRepository.findAllById(anyLong())).thenReturn(cars);
        var serviceMethod = carService.getExterior(String.valueOf(carId));
        assert serviceMethod == null;
    }

    @Test
    public void getAutoPilot(){

        List<Car> newCar = new ArrayList<>();
        newCar.add(car1);
        when(carRepository.findAllById(car1.getId())).thenReturn(newCar);
        var serviceMethod = carService.getAutoPilotSpecs(String.valueOf(car1.getId()));

        assert serviceMethod != null;
        assert car1.getAutoPilots().get(0).getPrice() == DefaultAutoPilot.Price;
    }

    @Test(expected = AutoPilotNotFoundException.class)
    public void shouldThrowAutoPilotNotFoundException() {
        Long carId = new Random().nextLong();

        when(carRepository.findAllById(anyLong())).thenReturn(cars);
        var serviceMethod = carService.getAutoPilotSpecs(String.valueOf(carId));
        assert serviceMethod == null;
    }

}

package com.rak.teslaprototype.intg;

import com.rak.teslaprototype.builder.CarBuilder;
import com.rak.teslaprototype.model.Car;
import com.rak.teslaprototype.repository.CarRepository;
import com.rak.teslaprototype.service.CarService.CarServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@ExtendWith({SpringExtension.class})
public class TestCarController {

    private static MockHttpServletRequest request;

    List<Car> cars = new ArrayList<>();
    Car car1 = new CarBuilder().build();
    Car car2 = new CarBuilder().build();


    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarServiceImpl carService = new CarServiceImpl();

    @BeforeEach
    public void setup(){
        this.cars.add(car1);
        this.cars.add(car2);
        carRepository.save(car1);
        carRepository.save(car2);
    }

    @Test
    public void shouldFetchAllCars() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @Test
    public void shouldThrowServerErrorIfInvalidURL() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/ff/tege"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldFetchAllFeaturesOfAParticularCar() throws Exception {
        car1.setId(2L);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/2/features"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @Test
    public void throwsFeatureNotException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/232532/features"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldFetchAllInteriorOfAParticularCar() throws Exception {
        car1.setId(2L);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/2/interior"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @Test
    public void throwsInteriorNotException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/232532/interior"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void shouldFetchAllExteriorOfAParticularCar() throws Exception {
        car1.setId(2L);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/2/exterior"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @Test
    public void throwsExteriorNotException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/232532/exterior"))
                .andExpect(status().is4xxClientError());
    }
    @Test
    public void shouldFetchAllAutoPilotOptionsOfAParticularCar() throws Exception {
        car1.setId(2L);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/2/autopilot"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
    }

    @Test
    public void throwsAutoPilotNotException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/car/232532/autopilot"))
                .andExpect(status().is4xxClientError());
    }

}

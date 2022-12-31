package com.rak.teslaprototype.controller;

import com.rak.teslaprototype.service.GetAllCars.GetAllCarsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/v1/car")
@Slf4j
public class GetAllCarController {

    private final GetAllCarsService getAllCarsService;

    public GetAllCarController(GetAllCarsService getAllCarsService) {
        this.getAllCarsService = getAllCarsService;
    }

    @GetMapping("/create")
    public Mono<ResponseEntity<Customer>> createCustomer(@RequestBody @Valid CustomerDTO customerDTO){
        return customerMethodService.addCustomer(customerDTO).
                map(ResponseEntity.status(HttpStatus.CREATED)::body)
                .switchIfEmpty(Mono.just(ResponseEntity.badRequest().build()));

    }
}

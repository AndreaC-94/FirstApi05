package co.develhope.FirstAPI05.controllers;

import co.develhope.FirstAPI05.dto.CarDTO;
import co.develhope.FirstAPI05.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping ("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping
    public CarDTO getCar(CarDTO carDTO){
        return carService.getCar(carDTO);
    }

    @PostMapping
    public ResponseEntity postCar(@Valid @RequestBody CarDTO carDTO){
        return carService.status();
    }
}

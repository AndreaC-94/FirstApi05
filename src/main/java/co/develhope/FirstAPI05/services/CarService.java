package co.develhope.FirstAPI05.services;

import co.develhope.FirstAPI05.dto.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarService {


    public CarDTO getCar(CarDTO carDTO) {
        return new CarDTO();
    }

    public ResponseEntity status() {
        return ResponseEntity.status(HttpStatus.CREATED).body("New car created.");
    }
}

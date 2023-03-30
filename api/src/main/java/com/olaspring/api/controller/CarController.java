package com.olaspring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olaspring.api.dto.CarDTO;
import com.olaspring.api.model.Car;
import com.olaspring.api.repository.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
  @Autowired
  private CarRepository repository;

  @PostMapping
  String create(@RequestBody CarDTO body) {
    System.out.println(body.modelo());
    System.out.println(body.fabricante());
    System.out.println(body.anomodelo());
    System.out.println(body.valor());
    System.out.println(body.datafabricacao());

    Car car = new Car(body);
    repository.save(car);
    return("Car created!");
  }

  @GetMapping
  List<Car> listAll() {
    return repository.findAll();
  }
}

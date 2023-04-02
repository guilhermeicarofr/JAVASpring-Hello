package com.olaspring.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olaspring.api.dto.CarDTO;
import com.olaspring.api.model.Car;
import com.olaspring.api.service.CarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {
  @Autowired
  private CarService service;

  @PostMapping
  public void create(@RequestBody @Valid CarDTO body) {
    service.save(body);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable long id) {
    service.delete(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable long id, @RequestBody @Valid CarDTO body) {
    service.update(id, body);
  }
 
  @GetMapping
  public List<Car> readAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Car> readOne(@PathVariable long id) {
    return service.findOne(id);
  }
}

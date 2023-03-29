package com.olaspring.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olaspring.api.dto.CarDTO;

@RestController
@RequestMapping("/cars")
public class CarController {
  @PostMapping
  void create(@RequestBody CarDTO body) {
    System.out.println(body.modelo());
    System.out.println(body.fabricante());
    System.out.println(body.anoModelo());
    System.out.println(body.valor());
    System.out.println(body.dataFabricacao());
  }
}

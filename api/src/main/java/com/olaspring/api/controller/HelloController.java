package com.olaspring.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
  @GetMapping
  public String hello() {
    return("Hello from Spring Framework!");
  }
}

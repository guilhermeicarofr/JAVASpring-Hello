package com.olaspring.api.model;

import java.util.Date;

import com.olaspring.api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
  public Car() {}

  public Car(CarDTO car) {
    this.modelo = car.modelo();
    this.fabricante = car.fabricante();
    this.datafabricacao = car.datafabricacao();
    this.valor = car.valor();
    this.anomodelo = car.anomodelo();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String modelo;

  @Column(nullable = false)
  private String fabricante;

  @Column(nullable = false)
  private Date datafabricacao;

  @Column(nullable = false)
  private int valor;

  @Column(nullable = false)
  private int anomodelo;
}

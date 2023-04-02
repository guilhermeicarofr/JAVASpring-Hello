package com.olaspring.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olaspring.api.dto.CarDTO;
import com.olaspring.api.model.Car;
import com.olaspring.api.repository.CarRepository;

@Service
public class CarService {
  @Autowired
  private CarRepository repository;

  public Optional<Car> findOne(long id) {
    return repository.findById(id);
  }

  public List<Car> findAll() {
    return repository.findAll();
  }

  public void save(CarDTO dto) {
    repository.save(new Car(dto));
  }

  public void update(long id, CarDTO dto) {
    repository.findById(id).map(car -> {
      car.setModelo(dto.modelo());
      car.setFabricante(dto.fabricante());
      car.setDatafabricacao(dto.datafabricacao());
      car.setValor(dto.valor());
      car.setAnomodelo(dto.anomodelo());
      return repository.save(car);
    });
  }

  public void delete(long id) {
    repository.deleteById(id);
  }
}

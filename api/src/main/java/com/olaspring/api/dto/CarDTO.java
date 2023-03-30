package com.olaspring.api.dto;

public record CarDTO(
  String modelo,
  String fabricante,
  String datafabricacao,
  int valor,
  int anomodelo
) {}

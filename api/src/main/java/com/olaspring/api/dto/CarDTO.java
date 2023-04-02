package com.olaspring.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarDTO(
  @NotBlank String modelo,
  @NotBlank String fabricante,
  @NotNull Date datafabricacao,
  @NotNull int valor,
  @NotNull int anomodelo
) {}

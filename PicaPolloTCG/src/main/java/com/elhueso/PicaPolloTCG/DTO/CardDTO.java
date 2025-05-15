package com.elhueso.PicaPolloTCG.DTO;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public record CardDTO(
    int id,
    String nom,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate dataImpresio,
    double preu
) {}

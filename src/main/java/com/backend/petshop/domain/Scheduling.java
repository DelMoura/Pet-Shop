package com.backend.petshop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@Builder
public class Scheduling {
    @Id
    private String id;
    @NotBlank
    @NotNull
    private Animal animal;
    @NotBlank
    @NotNull
    private Client client;
    private LocalDateTime time;
    @NotBlank
    @NotNull
    private String procedure;
    @NotBlank
    @NotNull
    private Double price;

}

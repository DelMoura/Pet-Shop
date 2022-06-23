package com.backend.petshop.domain;

import com.backend.petshop.domain.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document
@Data
@AllArgsConstructor
@Builder
public class Animal {
    @Id
    private  String id;
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private SexEnum sex;
    @NotBlank
    @NotNull
    private String race;
    @NotBlank
    @NotNull
    private String description;
    @NotBlank
    @NotNull
    private Client owner;

}

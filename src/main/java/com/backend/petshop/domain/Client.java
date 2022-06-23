package com.backend.petshop.domain;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@Builder
public class Client {
    @Id
    private  String id;
    @NotNull
    @NotBlank
    @Min(15)
    private String name;
    @CPF
    @NotBlank
    @NotNull
    private String cpf;
    @Email
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    private String telephone;
    private List<Animal> animals;


}

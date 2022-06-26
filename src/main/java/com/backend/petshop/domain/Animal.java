package com.backend.petshop.domain;

import com.backend.petshop.domain.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document
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
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public SexEnum getSex() {
        return sex;
    }
    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Client getOwner() {
        return owner;
    }
    public void setOwner(Client owner) {
        this.owner = owner;
    }

    

}

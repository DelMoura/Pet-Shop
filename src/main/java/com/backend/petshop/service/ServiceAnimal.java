package com.backend.petshop.service;

import com.backend.petshop.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceAnimal {
    private final AnimalRepository animalRepository;

    public ServiceAnimal(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }


}

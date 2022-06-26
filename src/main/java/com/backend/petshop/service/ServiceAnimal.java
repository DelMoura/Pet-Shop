package com.backend.petshop.service;

import com.backend.petshop.domain.Animal;
import com.backend.petshop.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class ServiceAnimal {
    private final AnimalRepository animalRepository;

    public ServiceAnimal(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void registerAnimal(Animal animal) {
        this.animalRepository.save(animal);
    }

    public void deleteAnimal(Animal animal) {
        this.animalRepository.delete(animal);
    }

    public List<Animal> allAnimal() {
        return this.animalRepository.findAll();

    }

    public Optional<Animal> selectById(Animal animal) {
        return this.animalRepository.findById(animal.getId());

    }

}

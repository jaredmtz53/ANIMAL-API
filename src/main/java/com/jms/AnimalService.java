package com.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }
    public Animal getAnimalById(int id){
        return animalRepository.findById(id).orElse(null);
    }
    public Animal addAnimal(Animal animal){
        return animalRepository.save(animal);
    }
    public void deleteAnimal(int id){
        animalRepository.deleteById(id);
    }
    public List<Animal> getAnimalByBreed(String name){
        return animalRepository.findByBreed(name);
    }
    public List<Animal> getAnimalByName(String name){
        return animalRepository.findByNameContaining(name);
    }
}

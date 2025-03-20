package com.jms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable int id){
        return new ResponseEntity<>(animalService.getAnimalById(id), HttpStatus.OK);
    }
    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal){
        return animalService.addAnimal(animal);
    }
    @PutMapping("/{id}")
    public void updateAnimal(@PathVariable int id, @RequestBody Animal animal){
        animal.setAnimalId(id);
        animalService.addAnimal(animal);
    }
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalService.deleteAnimal(id);
    }
    @GetMapping("/breed/{breed}")
    public ResponseEntity<List<Animal>> getAnimalByBreed(@PathVariable String breed){
        return new ResponseEntity<>(animalService.getAnimalByBreed(breed), HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Animal>> getAnimalByName(@PathVariable String name){
        return new ResponseEntity<>(animalService.getAnimalByName(name), HttpStatus.OK);
    }
    }


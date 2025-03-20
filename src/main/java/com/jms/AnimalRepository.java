package com.jms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{
    List<Animal> findByBreed(String breed);
    List<Animal> findByNameContaining(String name);
}


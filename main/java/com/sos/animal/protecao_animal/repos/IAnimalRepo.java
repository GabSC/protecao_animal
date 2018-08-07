package com.sos.animal.protecao_animal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sos.animal.protecao_animal.model.Animal;

public interface IAnimalRepo extends CrudRepository<Animal, Long> {

}

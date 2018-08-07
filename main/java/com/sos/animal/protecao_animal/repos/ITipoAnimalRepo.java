package com.sos.animal.protecao_animal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sos.animal.protecao_animal.model.TipoAnimal;

public interface ITipoAnimalRepo  extends CrudRepository<TipoAnimal, Long>{

}

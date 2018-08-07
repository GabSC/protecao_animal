package com.sos.animal.protecao_animal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sos.animal.protecao_animal.model.Foto;

public interface IFotoRepo extends CrudRepository<Foto, Long> {

}

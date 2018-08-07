package com.sos.animal.protecao_animal.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sos.animal.protecao_animal.model.Cidade;

public interface iCidadeRepo extends CrudRepository<Cidade,Long> {

	@Override
	List<Cidade> findAll();
	
}

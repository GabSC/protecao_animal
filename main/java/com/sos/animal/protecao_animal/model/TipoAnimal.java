package com.sos.animal.protecao_animal.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class TipoAnimal {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	private String tipo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoAnimal")
	private List<Animal> animal;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoAnimal")
	private List<Raca> raca;
	
	
	
	
	public List<Animal> getAnimal() {
		return animal;
	}


	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}


	public List<Raca> getRaca() {
		return raca;
	}


	public void setRaca(List<Raca> raca) {
		this.raca = raca;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
	
	
}

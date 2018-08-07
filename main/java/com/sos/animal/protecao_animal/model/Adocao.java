package com.sos.animal.protecao_animal.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Adocao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	private Timestamp dataAdocao;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "adocao")
	private List<Animal> animal;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "adocao")
	private List<Historico> historico;
	
	@ManyToOne
	private Adotante adotante;
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Timestamp getDataAdocao() {
		return dataAdocao;
	}


	public void setDataAdocao(Timestamp dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
	
	
	
}

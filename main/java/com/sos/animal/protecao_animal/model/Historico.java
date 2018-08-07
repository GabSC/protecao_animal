package com.sos.animal.protecao_animal.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	private Timestamp dataHora;

	@ManyToOne
	private Adocao adocao;

	
	
	
	public Adocao getAdocao() {
		return adocao;
	}


	public void setAdocao(Adocao adocao) {
		this.adocao = adocao;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Timestamp getDataHora() {
		return dataHora;
	}


	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
}

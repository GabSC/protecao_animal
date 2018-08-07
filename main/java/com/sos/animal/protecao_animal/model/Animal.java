package com.sos.animal.protecao_animal.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private Boolean estaCastrado;
	
	@Lob
	private String observacao;
	
	private Timestamp dataResgate;
	
	@Enumerated(value = EnumType.STRING)
	private Sexo sexo;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "animal")
	private List<Foto> fotos;
	
	@ManyToOne()
	private Adocao adocao;
	
	@ManyToOne
	private TipoAnimal tipoAnimal;
	
	private String corPredominante;
	
	private String  porte;
	
	private String nome;
	
	private Boolean estaDisponivelParaAdoacao;

	
	
	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Adocao getAdocao() {
		return adocao;
	}

	public void setAdocao(Adocao adocao) {
		this.adocao = adocao;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Boolean getEstaCastrado() {
		return estaCastrado;
	}

	public void setEstaCastrado(Boolean estaCastrado) {
		this.estaCastrado = estaCastrado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Timestamp getDataResgate() {
		return dataResgate;
	}

	public void setDataResgate(Timestamp dataResgate) {
		this.dataResgate = dataResgate;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getEstaDisponivelParaAdoacao() {
		return estaDisponivelParaAdoacao;
	}

	public void setEstaDisponivelParaAdoacao(Boolean estaDisponivelParaAdoacao) {
		this.estaDisponivelParaAdoacao = estaDisponivelParaAdoacao;
	}
	
	
	
	
}

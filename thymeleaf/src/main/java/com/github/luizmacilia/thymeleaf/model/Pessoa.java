package com.github.luizmacilia.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private Long id;
	private String nome;
	//avisar q para criar a tabela ele tem q criar como String
	@Enumerated(EnumType.STRING)
	private SexoTipo sexo;
	
	
	
	public Pessoa(Long id, String nome, SexoTipo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SexoTipo getSexo() {
		return sexo;
	}
	public void setSexo(SexoTipo sexo) {
		this.sexo = sexo;
	}
	
	
}

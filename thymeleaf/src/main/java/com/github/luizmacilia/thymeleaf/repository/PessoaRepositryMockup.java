package com.github.luizmacilia.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.luizmacilia.thymeleaf.model.Pessoa;
import com.github.luizmacilia.thymeleaf.model.SexoTipo;

public class PessoaRepositryMockup {

//Quero que essa classe retorne uma lista de dados
//1	Pelé	Masculino
//2	Rainha Elizabeth	Feminino
	
//assinatura de um metodo, oq ele retorna e quais são os dados q ele tem

	public List<Pessoa> list(){
		//interface e metodo q implementa a interface
		List<Pessoa> result = new ArrayList<>();
		
		//instanciar ja recebendo valores
		//para instânciar ela (new) eu preciso criar um Construtor nela
		//1L pois é long
		Pessoa pessoa = new Pessoa(1L, "Pelé", SexoTipo.M);
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Rainha Elizabeth", SexoTipo.F);
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Beyonce", SexoTipo.F));
		
		
		return result;
	}
	
}

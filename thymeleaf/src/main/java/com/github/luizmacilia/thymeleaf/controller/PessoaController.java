package com.github.luizmacilia.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.luizmacilia.thymeleaf.model.Pessoa;
import com.github.luizmacilia.thymeleaf.repository.PessoaRepository;
import com.github.luizmacilia.thymeleaf.repository.PessoaRepositryMockup;


@Controller
//quero q vc ouça e responda só qunado na url tiver o /pessoas
@RequestMapping("/pessoas")
public class PessoaController {
	
	
	//pegar algo q está em memoria e uso = injeção
	@Autowired
	private PessoaRepository pessoaRepository;
	
	

	//preciso dizer para o pessoas que ele precisa ouvir um metodo
	//Basicamente a anotação responde sempre q for uma tentativa de acesso "GET"
		@RequestMapping(value = "/listar", method = RequestMethod.GET)
		public String list(Model model) {
			
			//armazenar dados
			List<Pessoa> pessoas =pessoaRepository.findAll();
			//criando um atributo no modelo
			model.addAttribute("pessoas", pessoas);
			
			
			
			return "pessoa/lista.html";
		}
}

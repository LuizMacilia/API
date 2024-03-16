package com.github.luizmacilia.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Aplicando uma annotation que vai informar que essa classe será uma exibidora
@Controller
public class IndexController {
	
	//metodo para devolver arquivo html
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}

	
	
}

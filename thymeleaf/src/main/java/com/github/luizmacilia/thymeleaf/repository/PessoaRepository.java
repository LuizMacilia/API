package com.github.luizmacilia.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.luizmacilia.thymeleaf.model.Pessoa;

//OPA TENHO QUE RELACIONAR O BD NA ENTIDADE PESSOAS
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
//aqui foi passado apra ele de onde vincular e o tipo de dado do ID
	

}

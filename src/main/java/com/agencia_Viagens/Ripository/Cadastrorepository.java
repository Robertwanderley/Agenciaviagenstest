package com.agencia_Viagens.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia_Viagens.Cadastro.model.Cadastro;

public interface Cadastrorepository extends JpaRepository<Cadastro,Long> {

	Cadastro findByid(Long id);
	

}

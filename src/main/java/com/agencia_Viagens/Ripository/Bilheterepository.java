package com.agencia_Viagens.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia_Viagens.Cadastro.model.Bilhete;


public interface Bilheterepository extends JpaRepository<Bilhete,Long> {

	Bilhete findByid(Long id);

}

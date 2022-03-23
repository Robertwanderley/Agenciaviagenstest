package com.agencia_Viagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia_Viagens.Cadastro.model.Cadastro;
import com.agencia_Viagens.Ripository.Cadastrorepository;


@RestController
@RequestMapping(value = "/api")
public class Cadastrocontroller {
	
	@Autowired
	Cadastrorepository cadastrorepository;

	@GetMapping("/cadastrar")
	public List<Cadastro> listacadastro(){
		return cadastrorepository.findAll();
	}
	
	@GetMapping("/cadastrar/{id}")
	public Cadastro cadastrounico(@PathVariable(value="id")Long id){
		return cadastrorepository.findByid(id);
	}
	
	@PostMapping("/cadastrar")
	public Cadastro salvarcadastro(@RequestBody Cadastro cadastro) {
	return cadastrorepository.save(cadastro);
	}
	
	@DeleteMapping("/cadastrar")
	public void apagarcadastro(@RequestBody Cadastro cadastro) {
	cadastrorepository.delete(cadastro);
	}
	
	@PutMapping("/cadastrar")
	public Cadastro atualizarcadastro(@RequestBody Cadastro cadastro) {
	return cadastrorepository.save(cadastro);
	}
}

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

import com.agencia_Viagens.Cadastro.model.Bilhete;
import com.agencia_Viagens.Ripository.Bilheterepository;
		
		@RestController
		@RequestMapping(value= "/api")
		public class Bilhetecontroller {
			@Autowired
			Bilheterepository bilheterepository;
		
			@GetMapping("/bilhete")
			public List<Bilhete> listabilhete(){
				return bilheterepository.findAll();
			}
			
			@GetMapping("/bilhete/{id}")
			public Bilhete bilheteunico(@PathVariable(value="id")Long id){
				return bilheterepository.findByid(id);
			}
			
			@PostMapping("/bilhete")
			public Bilhete salvarbilhete(@RequestBody Bilhete bilhete) {
			return bilheterepository.save(bilhete);
			}
			
			@DeleteMapping("/bilhete")
			public void apagarBilhete(@RequestBody Bilhete bilhete) {
			bilheterepository.delete(bilhete);
			}
			
			@PutMapping("/bilhete")
			public Bilhete atualizarbilhete(@RequestBody Bilhete bilhete) {
			return bilheterepository.save(bilhete);
			}

}

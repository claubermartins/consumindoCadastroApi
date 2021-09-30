package com.consumindocadastroapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumindocadastroapi.model.Cadastro;
import com.consumindocadastroapi.service.ServiceCasdastro;

@RestController
@RequestMapping("consumindoCadastroApi")
public class ControllerCadastro {
	
	private ServiceCasdastro serviceCadastro;
	
	@Autowired
	public ControllerCadastro(ServiceCasdastro serviceCadastro) {
		this.serviceCadastro = serviceCadastro;
	}

    @GetMapping
    ResponseEntity<List<Cadastro>> obterTodos() {
        List<Cadastro> cadastros = serviceCadastro.obterTodos();
        return ResponseEntity.ok(cadastros);
    }

	@GetMapping("/download")
	ResponseEntity<List<Cadastro>> download(){
		List <Cadastro> cadastros = serviceCadastro.download();
 		return ResponseEntity.ok(cadastros);
		
	}
	
	
	

}

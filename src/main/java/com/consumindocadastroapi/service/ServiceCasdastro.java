package com.consumindocadastroapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumindocadastroapi.model.Cadastro;


@Service
public class ServiceCasdastro {
	
	RestTemplate restTemplate = new RestTemplate();
	
	public List<Cadastro> obterTodos() {
		String URL = "http://35.193.116.145/cadastramento";
		
		HttpHeaders header =  new HttpHeaders();
		header.set("ContentType","application/json");
		HttpEntity<String> entity = new HttpEntity<>(header);
		
		ResponseEntity<Cadastro[]> pessoas = restTemplate.exchange(URL, HttpMethod.GET, entity,Cadastro[].class);
		
		return Arrays.asList(pessoas.getBody());
		
	}

}

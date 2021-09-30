package com.consumindocadastroapi.api;


import com.consumindocadastroapi.model.Cadastro;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class Api {

    public List<Cadastro> obterTodos() {
        RestTemplate restTemplate = new RestTemplate();
        String urlBase = "http://35.193.116.145/cadastramento";

        HttpHeaders header = new HttpHeaders();
        header.set("ContentType", "application/json");
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<Cadastro> cadastros = restTemplate.exchange(urlBase, HttpMethod.GET, entity, Cadastro.class);
        Cadastro cadastramentos = cadastros.getBody();
        return cadastramentos.getResults();
    }
}


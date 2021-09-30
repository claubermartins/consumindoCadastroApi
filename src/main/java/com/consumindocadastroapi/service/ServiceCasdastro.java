package com.consumindocadastroapi.service;


import com.consumindocadastroapi.api.Api;
import com.consumindocadastroapi.model.Cadastro;
import com.consumindocadastroapi.repository.RepositoryCadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCasdastro {
    private RepositoryCadastro repositoryCadastro;

    @Autowired
    public ServiceCasdastro(RepositoryCadastro repositoryCadastro) {
        this.repositoryCadastro = repositoryCadastro;
    }

    public List<Cadastro> obterTodos() {
        return repositoryCadastro.findAll();
    }

    public Optional<Cadastro> buscaPorId(Long id) {
        return repositoryCadastro.findById(id);
    }

    public Optional<Cadastro> buscarPorNome(String nome) {
        return repositoryCadastro.findByNameIgnoreCase(nome);
    }

    //espaço pro crud
    public List<Cadastro> download() {
        Api api = new Api();
        api.obterTodos();
        List<Cadastro> cadastros = api.obterTodos();
        return repositoryCadastro.saveAll(cadastros);
    }
}
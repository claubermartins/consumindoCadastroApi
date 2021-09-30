package com.consumindocadastroapi.repository;

import com.consumindocadastroapi.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryCadastro extends JpaRepository<Cadastro, Long> {
    Optional<Cadastro> findByNameIgnoreCase(String nome);
}

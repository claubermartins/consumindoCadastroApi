package com.consumindocadastroapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cadastro {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
}
package com.example.blogpessoal.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioLoginModel {

    private Long id;
    private String nome;
    private String usuario;
    private String senha;
    private String foto;
    private String token;

}

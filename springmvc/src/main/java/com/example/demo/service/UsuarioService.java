package com.example.demo.service;

import com.example.demo.dominio.Usuario;

public class UsuarioService {

public Usuario crearUsuario (){
    Usuario usuario = new Usuario("Diego", 25);
    return  usuario;
}
}

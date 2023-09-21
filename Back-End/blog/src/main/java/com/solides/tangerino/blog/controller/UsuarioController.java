package com.solides.tangerino.blog.controller;

import com.solides.tangerino.blog.model.Usuario;
import com.solides.tangerino.blog.service.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/codigo/{id}")
    public Optional<Usuario> buscarPeloId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

}

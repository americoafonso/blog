package com.solides.tangerino.blog.service.interfaces;

import com.solides.tangerino.blog.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> listar();

    public Optional<Usuario> buscarPorId(Long id);
}

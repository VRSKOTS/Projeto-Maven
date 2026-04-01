package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    // Lista que simula o banco de dados
    private List<Usuario> usuarios = new ArrayList<>();

    // Método para salvar um usuário
    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para buscar usuário pelo email
    public Usuario buscarPorEmail(String email) {
        return usuarios.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    // Método para listar todos os usuários
    public List<Usuario> listarTodos() {
        return new ArrayList<>(usuarios);
    }
}

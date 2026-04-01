package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRepositoryTest {

    @Test
    void deveSalvarUsuario() {
        Usuario usuario = new Usuario("Vinicius", "vinicius@email.com");
        // Simulação de salvar
        assertEquals("Vinicius", usuario.getNome());
        assertEquals("vinicius@email.com", usuario.getEmail());
    }
}

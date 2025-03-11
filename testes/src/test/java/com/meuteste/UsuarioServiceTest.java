package com.meuteste;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.testes.Usuario;
import com.example.testes.UsuarioService;

class UsuarioServiceTest {

    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        usuarioService = new UsuarioService();
    }

    @Test
    void testCadastroUsuario_ComDadosValidos() {
        Usuario usuario = new Usuario("João Silva", "joao.silva@email.com", "Senha123", "01/01/1990", "Rua A, 123", "(11)91234-5678", "123456789", new byte[]{1, 2, 3});
        boolean resultado = usuarioService.cadastrarUsuario(usuario);
        assertTrue(resultado, "O usuário deveria ser cadastrado com sucesso.");
    }

    @Test
    public void testCadastroUsuario_ComNomeVazio() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Nome Completo' é obrigatório", thrown.getMessage());
    }
    
    @Test
    void testCadastroUsuario_ComEmailVazio() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'E-mail' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComSenhaVazia() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Senha' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComDataDeNascimentoVazia() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Data de Nascimento' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComEnderecoVazio() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Endereço' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComTelefoneVazio() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Telefone' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComDocumentoVazio() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{1, 2, 3});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }

    @Test
    void testCadastroUsuario_ComFotoUsuarioVazia() {
        Usuario usuarioMock = mock(Usuario.class);
        when(usuarioMock.getNome()).thenReturn("João Silva");
        when(usuarioMock.getEmail()).thenReturn("joao.silva@email.com");
        when(usuarioMock.getSenha()).thenReturn("senha123");
        when(usuarioMock.getDataDeNascimento()).thenReturn("01/01/2000");
        when(usuarioMock.getEndereco()).thenReturn("Endereço");
        when(usuarioMock.getTelefone()).thenReturn("123456789");
        when(usuarioMock.getDocumento()).thenReturn("Documento");
        when(usuarioMock.getFotoUsuario()).thenReturn(new byte[]{});

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            usuarioService.cadastrarUsuario(usuarioMock);
        });

        Assertions.assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }
}
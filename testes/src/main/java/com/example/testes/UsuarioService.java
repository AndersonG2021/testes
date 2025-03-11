package com.example.testes;

public class UsuarioService {

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Nome Completo' é obrigatório");
        }
        if (usuario.getEmail() == null || usuario.getEmail().isEmpty()) {
            throw new IllegalArgumentException("O campo 'E-mail' é obrigatório");
        }
        if (usuario.getSenha() == null || usuario.getSenha().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Senha' é obrigatório");
        }
        if (usuario.getDataDeNascimento() == null || usuario.getDataDeNascimento().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Data de Nascimento' é obrigatório");
        }
        if (usuario.getEndereco() == null || usuario.getEndereco().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Endereço' é obrigatório");
        }
        if (usuario.getTelefone() == null || usuario.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Telefone' é obrigatório");
        }
        if (usuario.getDocumento() == null || usuario.getDocumento().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }
        if (usuario.getFotoUsuario() == null || usuario.getFotoUsuario().length == 0) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }


        // Simula o cadastro bem-sucedido no banco de dados
        return true;
    }
}

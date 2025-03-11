package com.example.testes;

public class PrestadorService {
    
    public boolean cadastrarPrestador(Prestador prestador) {
        if (prestador.getNome() == null || prestador.getNome().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Nome Completo' é obrigatório");
        }
        if (prestador.getEmail() == null || prestador.getEmail().isEmpty()) {
            throw new IllegalArgumentException("O campo 'E-mail' é obrigatório");
        }
        if (prestador.getSenha() == null || prestador.getSenha().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Senha' é obrigatório");
        }
        if (prestador.getDataDeNascimento() == null || prestador.getDataDeNascimento().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Data de Nascimento' é obrigatório");
        }
        if (prestador.getEndereco() == null || prestador.getEndereco().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Endereço' é obrigatório");
        }
        if (prestador.getTelefone() == null || prestador.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Telefone' é obrigatório");
        }
        if (prestador.getDocumento() == null || prestador.getDocumento().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }
        if (prestador.getFotoUsuario() == null || prestador.getFotoUsuario().length == 0) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }
        if (prestador.getFotoVeículo() == null || prestador.getFotoVeículo().length == 0) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }
        if (prestador.getAreaAbrangencia() == null || prestador.getAreaAbrangencia().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }
        if (prestador.getCompResidencia() == null || prestador.getCompResidencia().length == 0) {
            throw new IllegalArgumentException("O campo 'Documento' é obrigatório");
        }

        // Simula o cadastro bem-sucedido no banco de dados
        return true;
    }

}

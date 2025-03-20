package com.example.testes;

public class ItemTransporteService {

    public boolean cadastrarItemTransporte(ItemTransporte item) {
        if (item.getNome() == null || item.getNome().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Nome' é obrigatório");
        }
        if (item.getDimensoes() == null || item.getDimensoes().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Dimensões' é obrigatório");
        }
        if (item.getPeso() <= 0) {
            throw new IllegalArgumentException("O campo 'Peso' é obrigatório e deve ser maior que zero");
        }
        if (item.getCategoria() == null || item.getCategoria().isEmpty()) {
            throw new IllegalArgumentException("O campo 'Categoria' é obrigatório");
        }
        if (item.getFoto() == null || item.getFoto().length == 0) {
            throw new IllegalArgumentException("O campo 'Foto' é obrigatório");
        }

        // Simula o cadastro bem-sucedido no banco de dados
        return true;
    }
}

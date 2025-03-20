package com.meuteste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.testes.ItemTransporte;
import com.example.testes.ItemTransporteService;

public class ItemTransporteServiceTest {

    private ItemTransporteService itemTransporteService;

    @BeforeEach
    void setUp() {
        itemTransporteService = new ItemTransporteService();
    }

    // Teste TC_001: Verificação de erro ao tentar cadastrar um item sem preencher nenhum campo
    @Test
    void testCadastroItemTransporte_SemNenhumCampoPreenchido() {
        ItemTransporte item = new ItemTransporte("", "", 0, "", new byte[]{});
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            itemTransporteService.cadastrarItemTransporte(item);
        });
        assertEquals("O campo 'Nome' é obrigatório", thrown.getMessage());
    }

    // Teste TC_002: Verificação de erro ao tentar cadastrar um item sem selecionar a "categoria"
    @Test
    void testCadastroItemTransporte_SemCategoria() {
        ItemTransporte item = new ItemTransporte("Máquina de lavar", "90x60x60cm", 10.0, "", new byte[]{1, 2, 3});
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            itemTransporteService.cadastrarItemTransporte(item);
        });
        assertEquals("O campo 'Categoria' é obrigatório", thrown.getMessage());
    }

    // Teste TC_003: Verificação de erro ao tentar cadastrar um item sem anexar uma "foto"
    @Test
    void testCadastroItemTransporte_SemFoto() {
        ItemTransporte item = new ItemTransporte("TV 55\"", "120x70x10cm", 15.0, "Eletrônicos", new byte[]{});
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            itemTransporteService.cadastrarItemTransporte(item);
        });
        assertEquals("O campo 'Foto' é obrigatório", thrown.getMessage());
    }

    // Teste TC_004: Verificação de erro ao tentar cadastrar um item sem preencher o "nome do item"
    @Test
    void testCadastroItemTransporte_SemNome() {
        ItemTransporte item = new ItemTransporte("", "100x50x50cm", 25.0, "Eletrodomésticos", new byte[]{1, 2, 3});
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            itemTransporteService.cadastrarItemTransporte(item);
        });
        assertEquals("O campo 'Nome' é obrigatório", thrown.getMessage());
    }

    // Teste TC_005: Verificação de erro ao tentar cadastrar um item sem informar as "dimensões"
    @Test
    void testCadastroItemTransporte_SemDimensoes() {
        ItemTransporte item = new ItemTransporte("Sofá", "", 30.0, "Móveis", new byte[]{1, 2, 3});
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            itemTransporteService.cadastrarItemTransporte(item);
        });
        assertEquals("O campo 'Dimensões' é obrigatório", thrown.getMessage());
    }

    // Teste TC_006: Verificação do cadastro bem-sucedido de um item com todos os campos preenchidos corretamente
    @Test
    void testCadastroItemTransporte_ComTodosCamposPreenchidos() {
        ItemTransporte item = new ItemTransporte("Geladeira", "100x50x50cm", 25.0, "Eletrodomésticos", new byte[]{1, 2, 3});
        boolean resultado = itemTransporteService.cadastrarItemTransporte(item);
        assertTrue(resultado, "O item deveria ser cadastrado com sucesso.");
    }
}

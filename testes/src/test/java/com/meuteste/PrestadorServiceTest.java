package com.meuteste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.testes.Prestador;
import com.example.testes.PrestadorService;

public class PrestadorServiceTest {

    private PrestadorService prestadorService;

    @BeforeEach
    void setUp() {
        prestadorService = new PrestadorService();
    }

    // Teste TC_007: Verificação de erro ao tentar cadastrar um prestador sem a "Foto do Veículo"
    @Test
    void testCadastroPrestador_SemFotoVeiculo() {
        Prestador prestador= new Prestador(
            "João Silva", "joao.silva@email.com", "Senha123", "01/01/1990", 
            "Rua A, 123", "(11) 91234-5678", "RG123456789", new byte[]{1, 2, 3}, 
            new byte[]{}, "São Paulo", new byte[]{1, 2, 3}
        );

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            prestadorService.cadastrarPrestador(prestador);
        });
        assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }

    // Teste TC_008: Verificação de erro ao tentar cadastrar um prestador sem a "Área de Abrangência"
    @Test
    void testCadastroPrestador_SemAreaAbrangencia() {
        Prestador prestador = new Prestador(
            "João Silva", "joao.silva@email.com", "Senha123", "01/01/1990", 
            "Rua A, 123", "(11) 91234-5678", "RG123456789", new byte[]{1, 2, 3}, 
            new byte[]{1, 2, 3}, "", new byte[]{1, 2, 3}
        );

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            prestadorService.cadastrarPrestador(prestador);
        });
        assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }

    // Teste TC_009: Verificação de erro ao tentar cadastrar um prestador sem enviar a "Documentação do Veículo"
    @Test
    void testCadastroPrestador_SemDocumentacaoVeiculo() {
        Prestador prestador = new Prestador(
            "João Silva", "joao.silva@email.com", "Senha123", "01/01/1990", 
            "Rua A, 123", "(11) 91234-5678", "RG123456789", new byte[]{1, 2, 3}, 
            new byte[]{1, 2, 3}, "Recife", new byte[]{}
        );

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            prestadorService.cadastrarPrestador(prestador);
        });
        assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }

    // Teste TC_010: Verificação de erro ao tentar cadastrar um prestador sem enviar o "Comprovante de Residência"
    @Test
    void testCadastroPrestador_SemComprovanteResidencia() {
        Prestador prestador = new Prestador(
            "João Silva", "joao.silva@email.com", "Senha123", "01/01/1990", 
            "Rua A, 123", "(11) 91234-5678", "RG123456789", new byte[]{1, 2, 3}, 
            new byte[]{1, 2, 3}, "Recife", new byte[]{}
        );

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            prestadorService.cadastrarPrestador(prestador);
        });
        assertEquals("O campo 'Documento' é obrigatório", thrown.getMessage());
    }
}
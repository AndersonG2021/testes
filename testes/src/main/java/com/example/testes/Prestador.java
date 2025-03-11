package com.example.testes;

public class Prestador extends Usuario {
    private byte[] fotoVeículo;
    private String areaAbrangencia;
    private byte[] compResidencia;

    public Prestador(String nome, String email, String senha, String dataDeNascimento, String endereco, String telefone, String documento, byte[] fotoUsuario, byte[] fotoVeículo, String areaAbrangencia, byte[] compResidencia) {
        super(nome, email, senha, dataDeNascimento, endereco, telefone, documento, fotoUsuario);
        this.fotoVeículo = fotoVeículo;
        this.areaAbrangencia = areaAbrangencia;
        this.compResidencia = compResidencia;
    }

    public byte[] getFotoVeículo() {
        return fotoVeículo;
    }

    public void setFotoVeículo(byte[] fotoVeículo) {
        this.fotoVeículo = fotoVeículo;
    }

    public String getAreaAbrangencia() {
        return areaAbrangencia;
    }

    public void setAreaAbrangencia(String areaAbrangencia) {
        this.areaAbrangencia = areaAbrangencia;
    }

    public byte[] getCompResidencia() {
        return compResidencia;
    }

    public void setCompResidencia(byte[] compResidencia) {
        this.compResidencia = compResidencia;
    }
    

}

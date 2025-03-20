package com.example.testes;

public class ItemTransporte {
    private String nome;
    private String dimensoes;
    private double peso;
    private String categoria;
    private byte[] foto;

    public ItemTransporte(String nome, String dimensoes, double peso, String categoria, byte[] foto) {
        this.nome = nome;
        this.dimensoes = dimensoes;
        this.peso = peso;
        this.categoria = categoria;
        this.foto = foto;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}

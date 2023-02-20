/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufc;

/**
 *
 * @author jglau
 */
public class Lutador {
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias;
        private int empates;
        private int derrotas;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
    public void apresentação(){
        System.out.println("=============== APRESENTAÇÃO DO LUTADOR ===============");
        System.out.println("Apresentando o Lutador " + this.getNome() + " diretamente de " + this.getNacionalidade() + ".");
        System.out.println("Com " + this.getIdade() + " anos e pesando " + String.format("%.2f", this.getPeso()) + " kg.");
        System.out.println("Medindo " + String.format("%.2f", this.getAltura()) + " m e na categoria " + this.categoria + ".");
    }
    
    public void status(){
        System.out.println("================== STATUS DO LUTADOR ==================");
        System.out.println(this.getVitorias() + " vitórias.");
        System.out.println(this.getEmpates() + " empates.");
        System.out.println(this.getDerrotas() + " derrotas.");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() <= 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
     
}

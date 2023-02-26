/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author jglau
 */
public abstract class Pessoa {
        private String nome;
        private int idade;
        private String sexo;
        private int experiência;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiência = 0;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "; idade = " + idade + "; sexo = " + sexo + ";";
    }
    
    public void ganharExperiência(){
        this.setExperiência(this.getExperiência() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiência() {
        return experiência;
    }

    public void setExperiência(int experiência) {
        this.experiência = experiência;
    }
        
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoas;

/**
 *
 * @author jglau
 */
public class Aluno extends Pessoa {
        private int matrícula;
        private String curso;
        
    public void cancelarMatrícula(){
        System.out.println("Matrícula cancelada com sucesso.");
    }
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + ".");
    }
    
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
        
}

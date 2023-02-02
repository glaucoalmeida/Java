/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacaneta;

/**
 *
 * @author jglau
 */
public class Caneta {
        private String modelo;
        private String cor;
        private float ponta;
        private int carga;
        private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
 
    public void status(){
        System.out.println("----------------------------");
        System.out.println("       DADOS DA CANETA"      );
        System.out.println("----------------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.getTampada());
    }
    
    public void rabiscar(){
        if (this.getTampada()){
            System.out.println("Impossível rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar(){
        this.setTampada(true);
    }
    
    public void destampar(){
        this.setTampada(false);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}

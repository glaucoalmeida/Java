/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programabanco;

/**
 *
 * @author jglau
 */
public class Conta {
        private int numconta;
        private String tipo;
        private String dono;
        private float saldo;
        private boolean status;

    public Conta(int numconta, String tipo, String dono) {
        this.numconta = numconta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    
    public void status(){
        System.out.println("------------------------------------");
        System.out.println("           STATUS DA CONTA          ");
        System.out.println("------------------------------------");
        System.out.println("Número da Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + String.format("%.2f", this.getSaldo()));
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(){
        this.setStatus(true);
        if (this.getTipo() == "CC"){
            this.setSaldo(50);
            System.out.println("Conta corrente aberta com sucesso. Você recebeu R$ 50,00");
        } if (this.getTipo() == "CP"){
            this.setSaldo(150);
            System.out.println("Conta poupança aberta com sucesso. Você recebeu R$ 150,00");
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() < 0){
            System.out.println("Necessário pagar o débito restante");
        } else if (this.getSaldo() > 0){
            System.out.println("Necessário sacar o saldo restante");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float d){
        this.setSaldo(this.getSaldo() + d);
        System.out.println("Depósito realizado no valor de R$ " + String.format("%.2f", d));
    }
    
    public void sacar(float s){
        if (this.getSaldo() == s || this.getSaldo() > s){
            this.setSaldo(this.getSaldo() - s);
            System.out.println("Saque realizado no valor de R$ " + String.format("%.2f", s));
        } else {
            System.out.println("Valor de saque maior que o valor atual");
        }
    }
    
    public void pagMensal(){
        if (this.getTipo() == "CC"){
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Pagamento mensal realizado no valor de R$ 12,00");
        } if (this.getTipo() == "CP"){
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Pagamento mensal realizado no valor de R$ 20,00");
        }
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}

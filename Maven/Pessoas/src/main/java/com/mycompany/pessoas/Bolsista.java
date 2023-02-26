/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoas;

/**
 *
 * @author jglau
 */
public class Bolsista extends Aluno {
        private float bolsa;
        
        public void renovarBolsa(){
            System.out.println("Renovando bolsa de " + this.getNome() + ".");
        }
        
        @Override
        public void pagarMensalidade(){
            System.out.println("Pagamento realizado.");
        }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
        
        
}

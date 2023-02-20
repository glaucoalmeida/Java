/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufc;

import java.util.Random;

/**
 *
 * @author jglau
 */
public class Luta {
        private Lutador desafiado;
        private Lutador desafiante;
        private int rounds;
        private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
        } else {
            this.desafiado = null;
            this.desafiante = null;
            this.aprovada = false;
            System.out.println("Não foi possível marcar a luta.");
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            this.desafiado.apresentação();
            this.desafiante.apresentação();
            Random aleatorio = new Random ();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0 -> {
                    System.out.println("================== RESULTADO DA LUTA ==================");
                    System.out.println("EMPATE.");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("================== RESULTADO DA LUTA ==================");
                    System.out.println(this.desafiado.getNome() + " venceu.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("================== RESULTADO DA LUTA ==================");
                    System.out.println(this.desafiante.getNome() + " venceu.");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
        } else {
            System.out.println("Não foi possível lutar.");
        }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}

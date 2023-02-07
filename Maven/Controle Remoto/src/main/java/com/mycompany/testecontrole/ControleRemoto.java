/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecontrole;

/**
 *
 * @author jglau
 */
public class ControleRemoto implements Controlador {
        private int volume;
        private boolean ligado;
        private boolean tocando;

    public ControleRemoto() {
        this.volume = 20;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }        

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.ligado){
            System.out.println("------- MENU -------");
            System.out.print("Volume: " + this.getVolume());
            for(int i=1 ; i<=this.getVolume(); i+=10){
                System.out.print(" |");
            }
            System.out.println("\nEstá ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
        } else {
            System.out.println("Impossível abrir o menu com a TV desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu ...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossível aumentar o volume com a TV desligada.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossível diminuir o volume com a TV desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("Impossível mutar com a TV desligada.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(20);
        } else {
            System.out.println("Impossível desmutar com a TV desligada.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Impossível dar play com a TV desligada.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){ 
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar com a TV desligada.");
        }
    }
}

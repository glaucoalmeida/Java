/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author jglau
 */
public class Visualização {
        private Usuário espectador;
        private Vídeo filme;

    public Visualização(Usuário espectador, Vídeo filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliação(3);
    }
    
    public void avaliar(int n){
        if (n <= 5 && n > 0){
            this.filme.setAvaliação(n);
        } else {
            System.out.println("Avalie entre 1 e 5.");
        }
    }
    
    @Override
    public String toString() {
        return espectador + "\n" + filme;
    }
    
    public Usuário getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuário espectador) {
        this.espectador = espectador;
    }

    public Vídeo getFilme() {
        return filme;
    }

    public void setFilme(Vídeo filme) {
        this.filme = filme;
    }
}

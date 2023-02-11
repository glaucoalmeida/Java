/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leituralivro;

/**
 *
 * @author jglau
 */
public class Livro implements Publicação {
        private String título;
        private String autor;
        private int totPáginas;
        private int págAtual;
        private boolean aberto;
        private Pessoa leitor;

    public Livro(String título, String autor, int totPáginas, Pessoa leitor) {
        this.título = título;
        this.autor = autor;
        this.págAtual = 0;
        this.totPáginas = totPáginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "t\u00edtulo = " + título + ", autor = " + autor + ", totP\u00e1ginas = " + totPáginas 
                + "\np\u00e1gAtual = " + págAtual + ", aberto = " + aberto + "\nleitor = " + 
                this.leitor.getNome() + ", idade = " + this.leitor.getIdade() + ", sexo = " + this.leitor.getSexo();
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPáginas() {
        return totPáginas;
    }

    public void setTotPáginas(int totPáginas) {
        this.totPáginas = totPáginas;
    }

    public int getPágAtual() {
        return págAtual;
    }

    public void setPágAtual(int págAtual) {
        this.págAtual = págAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPágAtual(0);
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto()){
            if (p > this.totPáginas || p < 0){
                p = 0;
            } else {
                this.págAtual = p;
            }
    } else {
            System.out.println("Necessário abrir o livro para folhear.");
        }
    }

    @Override
    public void avançarPág() {
        if (this.getAberto()){
            if (this.getPágAtual() < this.getTotPáginas()){
                this.setPágAtual(this.getPágAtual() + 1);
            } else {
                this.setPágAtual(0);
            }
        } else {
            System.out.println("Necessário abrir o livro para passar as páginas.");
        }
    }

    @Override
    public void voltarPág() {
        if (this.getAberto()){
            if (this.getPágAtual() > 0){
                this.setPágAtual(this.getPágAtual() - 1);
            } else {
                this.setPágAtual(0);
            }
        } else {
            System.out.println("Necessário abrir o livro para voltar as páginas.");
        }
    }
}

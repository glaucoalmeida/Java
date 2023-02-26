/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoas;

/**
 *
 * @author jglau
 */
public class Técnico extends Aluno {
        private int registroProfissional;
     
        public void praticar(){
            System.out.println("Praticando ... ");
        }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
     
}

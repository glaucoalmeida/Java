/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacaneta;

/**
 *
 * @author jglau
 */
public class ProgramaCaneta {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC","Azul",1.5f,2,true);
        c1.destampar();
        c1.rabiscar();
        c1.status();
        Caneta c2 = new Caneta("Compacto","Preta",1.0f,1,false);
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}

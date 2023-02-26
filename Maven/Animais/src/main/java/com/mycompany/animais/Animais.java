/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;

/**
 *
 * @author jglau
 */
public class Animais {

    public static void main(String[] args) {
        Mamífero m = new Mamífero();
        Réptil r = new Réptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        Lobo l = new Lobo();
        
        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11,45);
        k.reagir(19,00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2,12.45f);
        k.reagir(17,4.5f);

    }
}

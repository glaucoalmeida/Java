/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author jglau
 */
public class Cachorro extends Mamífero {

    @Override
    public void emitirSom() {
        System.out.println("Au au au.");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando rabo.");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso.");
    }
    
    public void reagir(String frase){
        if ("Toma comida".equals(frase) || "Olá".equals(frase)){
            System.out.println("Abanar e latir.");
        } else {
            System.out.println("Rosnar.");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar.");
        } else if (hora >= 18) {
            System.out.println("Ignorar.");
        } else {
            System.out.println("Abanar e latir.");
        }
    }
    
    public void reagir (boolean dono){
        if (dono){
            System.out.println("Abanar.");
        } else {
            System.out.println("Rosnar e latir.");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar.");
            } else {
                System.out.println("Latir.");
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnar.");
            } else {
                System.out.println("Ignorar.");
            }
        }
    }
}

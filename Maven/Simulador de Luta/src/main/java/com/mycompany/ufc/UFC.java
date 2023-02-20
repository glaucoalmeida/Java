/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ufc;

/**
 *
 * @author jglau
 */
public class UFC {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Jon Jones","EUA",35,1.93f,113,26,1,1);
        l[1] = new Lutador("Khamzat Chimaev","Rússia",28,1.88f,77,11,0,0);
        l[2] = new Lutador("Justin Gaethje","EUA",34,1.80f,70.3f,23,0,4);
        l[3] = new Lutador("Caín Velásquez","EUA",40,1.85f,113,14,0,3);
        l[4] = new Lutador("Júnior Cigano","Brasil",39,1.93f,115,21,0,10);
        Luta l1 = new Luta();
        l1.marcarLuta(l[1], l[2]);
        l1.lutar();
        l[1].status();
        l[2].status();
    }
}

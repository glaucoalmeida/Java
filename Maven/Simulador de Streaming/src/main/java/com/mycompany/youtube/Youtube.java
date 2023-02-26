/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author jglau
 */
public class Youtube {

    public static void main(String[] args) {
        Usuário u[] = new Usuário [2];
        u[0] = new Usuário("Fábio",25,"M","iamfabio");
        u[1] = new Usuário("Maria",18,"F","mariazinha");
        
        Vídeo v[] = new Vídeo [3];
        v[0] = new Vídeo("Java POO");
        v[1] = new Vídeo("POO para iniciantes");
        v[1].setCurtidas(1);
        v[2] = new Vídeo("Programação básica");
        
        Visualização v1 = new Visualização(u[0],v[2]);
        v1.avaliar();
        System.out.println(v1.toString());
        Visualização v2 = new Visualização(u[0],v[1]);
        v2.avaliar(5);
        System.out.println(v2.toString());
    }
}

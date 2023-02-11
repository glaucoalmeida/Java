/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leituralivro;

/**
 *
 * @author jglau
 */
public class LeituraLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        p[0] = new Pessoa ("Lucas",25,"M");
        p[1] = new Pessoa ("Maria",19,"F");
        Livro l[] = new Livro [3];
        l[0] = new Livro("Aprendendo Java","José da Costa",300,p[0]);
        l[1] = new Livro("Java POO","Maria Soares",400,p[1]);
        l[2] = new Livro("Programação básica","André Furtado",200,p[1]);;
        l[2].abrir();
        l[2].folhear(180);
        l[2].avançarPág();
        System.out.println(l[2].toString());
}
}

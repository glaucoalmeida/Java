/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoas;

/**
 *
 * @author jglau
 */
public class Pessoas {

    public static void main(String[] args) {
           Aluno v1 = new Aluno();
           v1.setNome("Glauco");
           v1.setIdade(25);
           v1.setSexo("M");
           v1.setMatrícula(1234);
           v1.setCurso("Informática");
           System.out.println(v1.toString());
}
}

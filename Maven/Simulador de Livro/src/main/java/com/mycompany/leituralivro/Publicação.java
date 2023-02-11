/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.leituralivro;

/**
 *
 * @author jglau
 */
public interface Publicação {
        public abstract void abrir();
        public abstract void fechar();
        public abstract void folhear(int p);
        public abstract void avançarPág();
        public abstract void voltarPág();
}

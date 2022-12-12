/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = -1, p = -1,i = 0, m=0,so=0;
        float me=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe o número: <br> (0 interrompe) </html>"));
            s++;
            so += n;
            me = (float) so/s;
            if (n%2 == 0){
                p++;
            } else{
                i++;
            }
            if (n > 100){
                m++;
            }
        } while (n!= 0);
        JOptionPane.showMessageDialog(null, "<html>O somatório é "+so+"." + "<br>O número de valores é " + s +"."+"<br>O número de pares é " + p+"."+
                "<br>O número de ímpares é " + i +"."+"<br>Acima de 100: "+m+"."+"<br>A média é " +me+".");
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doce;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Mostrar numeros del 100 al 1", "Salir", JOptionPane.INFORMATION_MESSAGE);
         for(int a=100; a>=1;a--)
         {
             int res=a % 2;
             if(res==0){
                 JOptionPane.showMessageDialog(null, "Numero Par: "+a, "Validar", JOptionPane.INFORMATION_MESSAGE);
             }
         }
    }
    
}

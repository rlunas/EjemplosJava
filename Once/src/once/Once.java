/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package once;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Once {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JOptionPane.showMessageDialog(null, "Mostrar numeros del 1 al 100", "Salir", JOptionPane.INFORMATION_MESSAGE);
         for(int a=1; a<=100;a++)
         {
             JOptionPane.showMessageDialog(null, "Numero:"+a, "Salir", JOptionPane.INFORMATION_MESSAGE);
             
         }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  String num1,num2;
            num1 = JOptionPane.showInputDialog("¿Introduce primer numero?");
            num2 = JOptionPane.showInputDialog("¿Introduce segundo numero?");
             JOptionPane.showMessageDialog(null, num1+ "y"+num2, "Bienvenido tus numeros son: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String nombre;
            nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
            System.out.println("Bienvenido "+nombre);
             JOptionPane.showMessageDialog(null, nombre, "Bienvenido tu nombre es: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

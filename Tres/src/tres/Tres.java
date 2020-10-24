/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String grados;
            grados = JOptionPane.showInputDialog("Grados centigrados");
            float celcius = Float.parseFloat(grados);
            float f=(celcius*9/5)+32;
             JOptionPane.showMessageDialog(null, f, "Bienvenido tu nombre es: ", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quince;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Quince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Elaborar un programa que imprima la lista de números que hay en un rango dado por el usuario.
            String ri;
            ri = JOptionPane.showInputDialog("Introduce el rrango \n Rango inicial");
            int rai=Integer.parseInt(ri);
            ri = JOptionPane.showInputDialog("Rrango final");
            int rf=Integer.parseInt(ri);
        if (rai>rf){
            for (int i=rai;i>=rf;i--)
                {
                    JOptionPane.showMessageDialog(null, " Valor: "+ i, "Validar", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        else if(rf>rai){
                for (int i=rai;i<=rf;i++)
                {
                    JOptionPane.showMessageDialog(null, " Valor: " + i, "Validar", JOptionPane.INFORMATION_MESSAGE);
                }
        }

    }
    
}

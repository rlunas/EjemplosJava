/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trece;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Trece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String la;
                        la = JOptionPane.showInputDialog("Introduce un numero");
                        int num=Integer.parseInt(la);
                        for(int a=1; a<=10;a++)
                            {
                                int res=a * num;
                                    JOptionPane.showMessageDialog(null, num+" X "+a+" = "+res, "Validar", JOptionPane.INFORMATION_MESSAGE);
                            }
    }
    
}

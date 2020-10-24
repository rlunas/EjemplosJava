/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seis;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
            valor = JOptionPane.showInputDialog("Introduce un valor");
            int numero = Integer.parseInt(valor);
            int res= numero % 8;
            if (res==0){
                JOptionPane.showMessageDialog(null, "Numero: "+numero + " es multiplo de 8", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(null, "Numero: "+numero + " no es multiplo de 8", "Validar", JOptionPane.ERROR_MESSAGE);
            }
    }
    
}

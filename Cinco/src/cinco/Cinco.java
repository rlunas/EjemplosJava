/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinco;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
            valor = JOptionPane.showInputDialog("Introduce un valor");
            int numero = Integer.parseInt(valor);
            int res= numero % 2;
            if (res==0){
                JOptionPane.showMessageDialog(null, "Numero par: "+numero, "Validar: ", JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(null, "Numero Impar: "+numero, "Validar: ", JOptionPane.ERROR_MESSAGE);
            }
    }
    
}

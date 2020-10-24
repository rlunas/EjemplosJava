/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String valor;
            valor = JOptionPane.showInputDialog("Introduce numero de 5 cifras");
            String sCadena =valor;
            char[] aCaracteres = sCadena.toCharArray();
            int pos=0;
            StringBuffer cadena = new StringBuffer();
            if (aCaracteres.length==5){
                for(int x=0;x<5;x++){
                    JOptionPane.showMessageDialog(null, cadena.append(aCaracteres[x]), "Bienvenido tu nombre es: ", JOptionPane.INFORMATION_MESSAGE);
                    pos=pos+1;
                }
            }else{
                JOptionPane.showMessageDialog(null, "", "El arreglo no tiene 5 cifras: ", JOptionPane.ERROR_MESSAGE);
            }
             
    }
    
}

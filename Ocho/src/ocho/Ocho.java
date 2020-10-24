/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocho;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String valor;
            valor = JOptionPane.showInputDialog("Introduce valor del 1 al 12");
            int numero1 = Integer.parseInt(valor);
            if(numero1>0 && numero1<13)
            {
                switch(numero1)
        {
           case 1 :
               JOptionPane.showMessageDialog(null, "Enero", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; // break es opcional
           case 2 :
               JOptionPane.showMessageDialog(null, "Febrero", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
            case 3 :
               JOptionPane.showMessageDialog(null, "Marzo", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 4 :
               JOptionPane.showMessageDialog(null, "Abril", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 5 :
               JOptionPane.showMessageDialog(null, "Mayo", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 6 :
               JOptionPane.showMessageDialog(null, "Junio", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 7 :
               JOptionPane.showMessageDialog(null, "Julio", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 8 :
               JOptionPane.showMessageDialog(null, "Agosto", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 9 :
               JOptionPane.showMessageDialog(null, "Septiembre", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 10 :
               JOptionPane.showMessageDialog(null, "Octubre", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 11 :
               JOptionPane.showMessageDialog(null, "Noviembre", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              case 12 :
               JOptionPane.showMessageDialog(null, "Diciembre", "Mes", JOptionPane.INFORMATION_MESSAGE);
              break; 
              
           default : 
        }
            }else{
               JOptionPane.showMessageDialog(null, "El mes no existe", "Mes", JOptionPane.ERROR_MESSAGE); 
            }
    }
    
}

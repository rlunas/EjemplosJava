/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diez;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1=0;
        // TODO code application logic here
       do {  
         String valor;
         valor = JOptionPane.showInputDialog("1.- Chiste \n 2.- Poema \n 3.- frace \n 4.- Salir");
         numero1 = Integer.parseInt(valor);
                switch(numero1)
                {
                   case 1 :
                       JOptionPane.showMessageDialog(null, "- Mamá, en el colegio me llaman distraído \n - Juanito, tu vives en la casa de enfrente", "Chiste", JOptionPane.INFORMATION_MESSAGE);
                      break; // break es opcional
                   case 2 :
                       JOptionPane.showMessageDialog(null, "Triste mariposa linda\n entre todas la más bella,\n aunque sus ojos no vean\n todos la miran a ella.", "Poema", JOptionPane.INFORMATION_MESSAGE);
                      break; 
                    case 3 :
                       JOptionPane.showMessageDialog(null, "Mas sabe el diablo por viejo \n que por diablo", "Frace", JOptionPane.INFORMATION_MESSAGE);
                      break; 
                      case 4 :
                       JOptionPane.showMessageDialog(null, "Salir del programa", "Salir", JOptionPane.ERROR_MESSAGE);
                       numero1=5;
                      break; 
                   default : 
                }
        }while(numero1<5);
    }
    
}

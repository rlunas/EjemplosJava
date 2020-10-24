/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nueve;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1=0;
        // TODO code application logic here
       do {  
         String valor;
         valor = JOptionPane.showInputDialog("1.- Cuadrado \n 2.- Rectangulo \n 3.- Circulo \n 4.- Salir");
         numero1 = Integer.parseInt(valor);
                switch(numero1)
                {
                   case 1 :
                       String la;
                        la = JOptionPane.showInputDialog("1.- Area del Cuadrado \n Introduce el valor de un lado");
                        float lado=Float.parseFloat(la);
                        float res=lado*lado;
                       JOptionPane.showMessageDialog(null, "El area es: "+res, "Mes", JOptionPane.INFORMATION_MESSAGE);
                      break; // break es opcional
                   case 2 :
                       String b,a; 
                       b = JOptionPane.showInputDialog("1.- Area del Rectangulo \n Introduce el valor de la base");
                        float base=Float.parseFloat(b);
                        a = JOptionPane.showInputDialog("Introuce el valor de la altura");
                        float altura=Float.parseFloat(a);
                        float res2=base*altura;
                       JOptionPane.showMessageDialog(null, "El area es: "+res2, "Mes", JOptionPane.INFORMATION_MESSAGE);
                      break; 
                    case 3 :
                       String r;
                        r = JOptionPane.showInputDialog("1.- Area del Circulo \n Introduce el valor del radio");
                        double radio=Double.parseDouble(r);
                        double res3=3.141632*Math.pow(radio, 2);
                       JOptionPane.showMessageDialog(null, "El area es: "+res3, "Mes", JOptionPane.INFORMATION_MESSAGE);
                      break; 
                      case 4 :
                       JOptionPane.showMessageDialog(null, "Salir del programa", "Mes", JOptionPane.ERROR_MESSAGE);
                       numero1=5;
                      break; 
                   default : 
                }
        }while(numero1<5);
    }
    
}

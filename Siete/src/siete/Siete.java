/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siete;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Siete {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
            valor = JOptionPane.showInputDialog("Introduce valor uno");
            int numero1 = Integer.parseInt(valor);
            valor = JOptionPane.showInputDialog("Introduce valor dos");
            int numero2 = Integer.parseInt(valor);
            valor = JOptionPane.showInputDialog("Introduce valor tres");
            int numero3 = Integer.parseInt(valor);
            
            if(numero1>numero2 && numero1>numero3){
                JOptionPane.showMessageDialog(null, "Numero: "+numero1 + " es mayor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else if(numero2>numero1 && numero2>numero3){
                JOptionPane.showMessageDialog(null, "Numero: "+numero2 + " es mayor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else if(numero3>numero1 && numero3>numero2){
                JOptionPane.showMessageDialog(null, "Numero: "+numero3 + " es mayor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Los tres numeros son iguales", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }
            if(numero1<numero2 && numero1<numero3){
                JOptionPane.showMessageDialog(null, "Numero: "+numero1 + " es menor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else if(numero2<numero1 && numero2<numero3){
                JOptionPane.showMessageDialog(null, "Numero: "+numero2 + " es menor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else if(numero3<numero1 && numero3<numero2){
                JOptionPane.showMessageDialog(null, "Numero: "+numero3 + " es menor que todos", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Los tres numeros son iguales", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
}

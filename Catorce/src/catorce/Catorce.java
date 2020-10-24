/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catorce;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Catorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
         int [] array=new int [10];
          int val,menor;
          int mayor = array[0];
          menor=1000000000;
        //Elaborar un programa que pida 10 números al usuario y muestre cual es el mayor y cual es el menor.
        for (int i=0;i<10;i++)
        {
            String la;
            la = JOptionPane.showInputDialog("Introduce un numero");
            int num=Integer.parseInt(la);
            array[i]=num;

        }
        for (int i=0;i<10;i++)
        {
            if (array[i] > mayor)
            {
		mayor = array[i];
            }
            if (array[i] < menor)
            {
		menor = array[i];
            }
             //JOptionPane.showMessageDialog(null, " El numero mas grande es: "+array[i], "Validar", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, " El numero mas grande es: "+mayor, "Validar", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, " El numero mas pequeño es: "+menor, "Validar", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

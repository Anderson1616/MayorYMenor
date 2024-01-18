/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayorymenor;

import javax.swing.JOptionPane;

/**
 *
 * @author AnUman1
 */
public class MayorYMenor {
    
    
    
    //https://platzi.com/comunidad/retos-de-programacion-para-cualquier-lenguaje-segundo-nivel-condicionales/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: \n"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: \n"));
        int res1 = num1 - num2;
        int rest2 = num2 - num1;
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El " + num1 + " es mayor que " + num2 + "\nCon direfencia de: " + res1 + "");
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El " + num2 + " es mayor que " + num1 + "\nCon direfencia de: " + rest2 + "");
        } else {
            JOptionPane.showMessageDialog(null, "Son numeros iguales");
        }

    }

}

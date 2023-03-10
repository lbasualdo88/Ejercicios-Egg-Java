/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio4;

import java.util.Scanner;

/**
 *
 * @author leo-h
 */
public class JavaIntroEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int temperatura;
        double tempF;
        
        System.out.println("Ingrese temperatura");
        
        temperatura = leer.nextInt();
        
        tempF = 32 +(temperatura*9/5);
        
        System.out.println("La temperatura ingresada en Fahrenheit es: "+tempF);
        
    }
    
}

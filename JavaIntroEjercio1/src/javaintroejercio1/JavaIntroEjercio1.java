/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercio1;

import java.util.Scanner;
/*Escribir un programa que pida dos números 
enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma*/


/**
 *
 * @author leo-h
 */
public class JavaIntroEjercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, suma;
        
        
        System.out.println("Ingrese el primer numero:");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + suma);
       
        
    }
    
}

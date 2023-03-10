/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author leo-h
 */
public class JavaIntroEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese numero");
        
        num = leer.nextInt();
        

        
        System.out.println(num*2);
        System.out.println(num*3);
        System.out.println(sqrt(num));
    }
}

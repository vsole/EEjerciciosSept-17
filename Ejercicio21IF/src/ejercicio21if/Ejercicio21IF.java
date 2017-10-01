/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio21IF {

    /**
     * @param args the command line arguments
     * se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4
     * mostrar aprobó, de lo contrario mostrar “la próxima será”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        double nota;
        
        System.out.println("Ingrese su nota, valores 0 a 10:");
        nota=traerDato.nextDouble();
        
        if(nota==10)
           {
            System.out.println("Excelente!!!");
           }
        if(nota>=4)
            {
            System.out.println("Aprobo!!!");
            }
        if(nota>=9)
            {
             System.out.println("Aprobo!!!");
            }
            
        if(nota<4)
            {
             System.out.println("La proxima sera..");
            }
            
        
  
    }
    
}

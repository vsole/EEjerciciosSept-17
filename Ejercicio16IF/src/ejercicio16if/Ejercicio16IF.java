/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio16IF {

    /**
     * @param args the command line arguments
     * Se debe ingresar un edad  e  informar si es mayor de edad o no.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        int Edad;
        
        System.out.println("Ingrese su Edad:");
        Edad=traerDato.nextInt();
        
        if(Edad>=18)
           {
               System.out.println("Usted es mayor de Edad!!");
        }
    }
    
}

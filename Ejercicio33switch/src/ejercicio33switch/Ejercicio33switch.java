/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio33switch {

    /**
     * @param args the command line arguments
     * al ingresar un signo del zodíaco devolver el nombre de la imagen asociada 
     * a ese signo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String signo;
        
        System.out.println("Ingrese su Signo del Zodiaco");
        signo= traerDato.next();
        
        switch(signo)
        {
        case"acauario":
                System.out.println("El aguador");
                break;
        case"piscics":
                System.out.println("Los peces");
                break;
        case"aries":
                System.out.println("El carnero");
                break;
        case"tauro":
                System.out.println("El toro");
                break;
        case"geminis":
                System.out.println("Los gemelos");
                break;
        case"cancer":
                System.out.println("El cangrejo");
                break;
        case"loe":
                System.out.println("El leon");
                break;
        case"virgo":
                System.out.println("La virgen");
                break;
        case"libra":
                System.out.println("La balanza");
                break;
        case"escorpio":
                System.out.println("El escorpion");
                break;
        case"capricornio":
                System.out.println("La cabra");
                break;
                
        
        
        
        
        }
        
    }
    
}

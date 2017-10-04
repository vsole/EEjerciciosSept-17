/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio29switch {

    /**
     * @param args the command line arguments
     * 29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje
     * “Iniciando el año” ,si es junio o julio el mensaje” Mitad del año” 
     * y si es diciembre el mensaje fin de año.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese un mes:");
        mesDelAño=traerDato.next();
        
        switch(mesDelAño)
        {
            case"febrero":
                case"enero":
                    System.out.println("Iniciando el Año");
                    break;
            case"junio":
                case"julio":
                    System.out.println("Mitad de Año");
                    break;
            case "diciembre":
                     System.out.println("Fin de Año");
                     break;
        }
    }
    
}

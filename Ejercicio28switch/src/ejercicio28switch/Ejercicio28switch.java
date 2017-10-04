/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio28switch {

    /**
     * @param args the command line arguments
     * Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje
     * “Feliz verano” de lo contrario Informar “No es Verano”
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String mes;
        //String febrero;
        //String enero;
        
        System.out.println("Ingrese un mes:");
        mes=traerDato.next();
        
        switch(mes)
        {
         case "enero":
         case "febrero":     
                 System.out.println("Feliz Verano!!!!");
                 break;
         default:
             System.out.println("No es Verano.");
        }
        
    
}

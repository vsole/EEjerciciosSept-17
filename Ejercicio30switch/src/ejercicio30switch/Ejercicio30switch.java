/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio30switch {

    /**
     * @param args the command line arguments
     * 30- Se ingresa un mes del año y si es Enero: "que comiences bien el año!”
     * , si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” ,
     * si es Diciembre: "Felices fiesta!”.
     *      * 

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        String mes;
        
        System.out.println("ingrese un mes");
        mes=traerDato.next();
        
        switch (mes)
           {       
                case"enero":
                        System.out.println("Que comiences bien el año");
                        break;
                case"marzo": 
                         System.out.println("a clases!");
                         break;
                case"julio":
                         System.out.println("Se vienen las vacaciones");
                         break;
                case"diciembre":
                         System.out.println("Felices Fiestas");
                         break;
            }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio32switch {

    /**
     * @param args the command line arguments
     * 32- Al ingresar una hora del día, informar: si está entre las 7 y las 11:
     * "Es de mañana.".
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String datoAux;
        double hora;
        System.out.println("Ingrese la hora");
        datoAux = traerDato.next();
        hora = Double.parseDouble(datoAux);
        
        if (hora<7) && (hora>11)
                {
                    System.out.println("Es de mañana");
                  
                }
                
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioferrete1if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioFerrete1IF {

    /**
     * @param args the command line arguments
     *  Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos de
     * alambre e informar cuantos metros de alambre necesitamos para completar
     * las vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        double ancho, largo, superficie,total;
        int hilos;
        System.out.println("Ingrese el ancho de su terreno:");
        ancho=traerDato.nextDouble();
        System.out.println("Ingrese el largo de su terreno:");
        largo=traerDato.nextDouble();
        System.out.println("Ingrese la cantidad de hilos de alambre:");
        hilos=traerDato.nextInt();
        
        superficie=largo*2+ancho*2;
        total=superficie*hilos;
        
        System.out.println("Usted necesita en metros"+total);
        
        
        
        
        
        
        
    }
    
}

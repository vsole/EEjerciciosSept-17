/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioferrete2if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioFerrete2IF {

    /**
     * @param args the command line arguments
     * Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1
     * metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada 
     * material que necesito.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        float ancho,alto,metroCuadrado;
        float cal,cemento;
        
        System.out.println("Ingrese el ancho de la´pared:");
        ancho=traerDato.nextFloat();
        System.out.println("Ingrese la altura de la´pared:");
        alto=traerDato.nextFloat();
        
        metroCuadrado=ancho*alto;
        
        
        //System.out.println("Su pared tiene en metros cuadrados "+metroCuadrado);
        //metroCuadrado= traerDato.nextFloat();
        
        cal=metroCuadrado*2;
        //datoAux= traerDato.nextInt();
        //metroCuadrado= double.parseint(datoAux);
        
        System.out.println("Lo que usted necesita de cal para su pared es---"+cal); 
        
        
        cemento=metroCuadrado*3;
        System.out.println("Lo que usted necesita de cemento para su pared es---"+cemento);
        
        
      
        
            
             
        
            
        
            
            
            
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioferreteif;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioFerreteIF {

    /**
     * @param args the command line arguments
     * Debemos hacer una serie de aplicaciones para este negocio
     * 23- Debemos pedir el ancho y el largo de un terreno e informar cuantos metros de alambre necesitamos para dar tres (3) vueltas de alambre.
 + 
 +	25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada material que necesito.
 +	26- de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit, hacer la cuenta y mostrar el resultado.
 +	27- para una pileta se necesita saber la superficie, se debe pedir que tipo de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si es cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.
 +	
 +    public static void main(String[] args) {
 +        // TODO code application logic here
 * 
 +    }
 +    
 +}

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        double ancho, largo, superficie,vueltas;
        System.out.println("Ingrese el ancho de su terreno:");
        ancho=traerDato.nextDouble();
        System.out.println("Ingrese el largo de su terreno:");
        largo=traerDato.nextDouble();
        
        superficie=largo*2+ancho*2;
        vueltas=superficie*3;
        
        System.out.println("Para dar 3 vueltas de alambre a su terreno, necesita mtrs:"+vueltas);
        
        
    }
    
}

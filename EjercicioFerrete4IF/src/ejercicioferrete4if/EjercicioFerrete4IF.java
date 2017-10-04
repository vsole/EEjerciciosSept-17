/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioferrete4if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioFerrete4IF {

    /**
     * @param args the command line arguments
     * para una pileta se necesita saber la superficie, se debe pedir que tipo
     * de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si 
     * es cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.
 +	
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String cuadrada, redonda;
        float base,altura,supC;
        double radio, supR;
        String respuesta;
        System.out.println("Superficie Pileta.");
        System.out.println("Su pileta es Redonda? responda r, si es Cuadrada responda c.");
        respuesta=traerDato.next();
        //circulo=3.14*(radio*radio)
        //cuadrada= base*altura
        
        if(respuesta.equals("r"))
        {
            System.out.println("Ingrese el radio:");
            radio=traerDato.nextDouble();
            supR=3.14*(radio*radio);
            
            System.out.println("La sup de su pileta es de"+supR);
        }
            else if(respuesta.equals("c"))
        {
            System.out.println("Ingrese el largo y el ancho:");
            base=traerDato.nextFloat();
            altura=traerDato.nextFloat();
            supC=base*altura;
            
            System.out.println("La sup de la pileta es de:"+supC);
            
        }
        
        
    }
    
}

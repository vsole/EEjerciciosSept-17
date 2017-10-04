/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioferrete3if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioFerrete3IF {

    /**
     * @param args the command line arguments
     * de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit,
     * hacer la cuenta y mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        //c=(f-32)*5/9
        float temperaturaIngresada;
        float celsius;
        float fahrenheit;
        String respuesta;
        float datoAux;
        
        System.out.println("Ingrese la temperatura:");
        temperaturaIngresada= traerDato.nextFloat();
        System.out.println("Quiere convertir la temperatura? si es de celsius a Farhenheit INGRESE c, Si es de Farhenheit a celsius, INGRESE f.");
        respuesta= traerDato.next();
        
        
        if(respuesta.equals("f"))
        {
            //celsius=(fahrenheit-32)*1.8;
            //celsius/1.8=farhrenheit-32
            
            //fahrenheit=traerDato.nextFloat();
            datoAux= (float) (temperaturaIngresada/1.8);
            fahrenheit=datoAux+32;
            
         
            System.out.println("Temperatura Ingresada convertida a fahrenheit seria:"+fahrenheit);
        }
        if(respuesta.equals("c"))
        {
         celsius=temperaturaIngresada-32*1.8;
            System.out.println("Temperatura ingresada convertida en celsius seria"+celsius);
        }
       
    }
    
}

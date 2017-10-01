/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio13IF {

    /**
     * @param args the command line arguments
     * Se ingresa un color y una localidad, si es avellaneda o Lanús y 
     * el color es rojo, mostrar el mensaje “sos de independiente”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        String color;
        String localidad;
        
        System.out.println("Ingrese un color:");
        color= traerDato.next();
        System.out.println("INgrese una localidad:");
        localidad= traerDato.next();
        
        if(color.equals("rojo"))
            {
                
            System.out.println("Sos de Independiente!!");
            }
            if(localidad.equals("lanus"))
            {
                System.out.println("Sos de Independiente!!");
            
                    if(localidad.equals("avellaneda"))
                    {
                        System.out.println("Sos de Independiente!!");
                    }
            }
            
    
    
    } 
    
}

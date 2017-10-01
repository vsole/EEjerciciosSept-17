/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio17IF {

    /**
     * @param args the command line arguments
     * Se pide una edad y se informa si es niño adolescente o mayor de edad

     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner traerDato= new Scanner(System.in);
        
        int Edad;
        
        System.out.println("Ingrese su Edad:");
        Edad=traerDato.nextInt();
        
        if(Edad<=13)
          {
                System.out.println("Es un niño!");
          }
            if(Edad>13 && Edad<18)   
            {
                System.out.println("Es un adolecente!");
            }
              if(Edad>=18)
                {
                 System.out.println("Es un mayor degenerado!");
                }
            
          
    }
}

        
                
    
       

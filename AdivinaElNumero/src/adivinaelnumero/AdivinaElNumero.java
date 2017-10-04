/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner (System.in);
        
        Integer numero=0;
        String datoAux;
        int numSecreto;
        Random aleatorio=new Random(System.currentTimeMillis());
        numSecreto= aleatorio.nextInt(10);
        
        System.out.println("Juego: Adivine el numero");
        datoAux= traerDato.next();
        numero= Integer.parseInt(datoAux);
        
        if(numSecreto==numero)
        {
            System.out.println("Acertasteeee..!");
        }
        if(numSecreto==numero+1)
        {
            System.out.println("Casi Casi..");
        }
        else if(numSecreto==numero-1)
        {
            System.out.println("Casi Casi..");
        }
        if(numSecreto==numero+2)
        {
            System.out.println("Estuviste cerca..");
        }
        else if(numSecreto==numero-2)
        {
           System.out.println("Estuviste cerca..");  
        }
        if(numSecreto==numero+3)
        {
             System.out.println("Niii Cerca..!");
        }
        else if(numSecreto==numero-3)
        {
             System.out.println("Niii cerca..");
        }
        if(numSecreto==numero+4)
        {
             System.out.println("Estuviste Bien Lejos..!");
        }
        else if(numSecreto==numero-4)
        {
            System.out.println("Estuviste Bien Lejos..!");
        }
        
        while(!numero.equals(numSecreto));
        
        //else
        //{
        //    System.out.println("Sos Horiible en este Juego..!");
        //}
        
        
        
        
        }        
                
                
                    
       
          
            
          
        
          
            
           
    }
    
}

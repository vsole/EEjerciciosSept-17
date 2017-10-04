/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio19IF {

    /**
     * @param args the command line arguments
     *  se ingresa un importe, si supera los 100 pesos se  le suma un impuesto 
     * del 23%, si no se les descuenta el 50%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        double importe;
        double imp1,desc1;
        double imp2,desc2;
        
        System.out.println("Ingrese el importe");
        importe= traerDato.nextDouble();
        
        
        if(importe>=100)
             {
                 desc1=importe*23/100;
                 imp1=importe-desc1;        
             System.out.println("importe com el descuento del impuesto:"+imp1);
             }
        else 
             {
                 desc2=importe*50/100;
                 imp2=importe-desc2;
              System.out.println("Al importe se le descuenta el 50%, quedaria en:"+imp2);
             }
                
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciio20if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejerciciio20IF {

    /**
     * @param args the command line arguments
     * Se ingresa un importe del pasaje de avión y el mes de viaje, si el mes
     * es enero, se les descuenta un 10% por temporada baja.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        double importe;
        String mes;
        double desc;
        double impTotal;
        
        System.out.println("Importe Pasaje:");
        importe= traerDato.nextDouble();
        
        System.out.println("Mes del Pasaje:");
        mes= traerDato.next();
        
        if(mes.equals("enero"))
        {   
            desc= importe*10/100;
            impTotal= importe-desc;
            System.out.println("Valor del pasaje:"+impTotal);
        }
        else 
        {
            
            System.out.println("Valor Pasaje:"+importe);
        }
    }
    
}

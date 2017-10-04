/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio31switch {

    /**
     * @param args the command line arguments
     * 31- Se ingresa un mes del año al seleccionar un mes informar: si tiene 
     * 28 días ,si tiene 30 días, si tiene 31 días.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        String mes;
        
        System.out.println("ingrese unmes");
        mes=traerDato.next();
        
        switch(mes)
        {
            case"enero":
            case"marzo":
            case"mayo":
            case"julio":
            case"agosto":
            case"octubre":
            case"diciembre":
                System.out.println("tiene 31 dias!");
                break;
            case"abril":
            case"junio":
            case "septiembre":
            case"noviembre":
                System.out.println("tiene 30 dias!");
                break;
            case"febrero":
                System.out.println("tiene 28 dias");
                break;
                
        }
    }
    
}

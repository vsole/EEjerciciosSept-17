/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio34switch {

    /**
     * @param args the command line arguments
     * Se pide un día de la semana, si es lunes mostrar el mensaje  “Buen comienzo”,
     * para el resto de los días hábiles mostrar” a aguantar “ si es sábado o domingo 
     * mostrar “ Buen fin de”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String dia;
        
        System.out.println("Ingrese un dia...");
        dia=traerDato.next();
        
        switch(dia)
        {
            case "lunes":
                System.out.println("Buen Comienzo!!!!");
                break;
            case"sabado":
            case"domingo":
                System.out.println("Buen Fin De");
                break;
            default:
                System.out.println("A aguantar!!!!");
                break;
        }
    }
    
}

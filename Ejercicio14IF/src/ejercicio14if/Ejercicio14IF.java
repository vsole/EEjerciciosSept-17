/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio14IF {

    /**
     * @param args the command line arguments
     * Se pide el sexo y el nombre, si es “f” de femenino, se muestra el
     * mensaje” feliz dia XXXXX”, donde XXXX es el nombre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        
        String Sexo, Nombre;
        
        
        System.out.println("Ingrese F, si es mujer y M si es hombre:");
        Sexo= traerDato.next();
        
        System.out.println("Ingrese Su Nombre:");
        Nombre= traerDato.next();
        
        if(Sexo.equals("F"))
        {
            System.out.println("Feliz Diaa"+Nombre);
        }
        
    }
    
}

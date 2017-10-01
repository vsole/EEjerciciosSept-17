/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15if;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio15IF {

    /**
     * @param args the command line arguments
     * 15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría  
     * y es de sexo masculino, viviendo en morón, se muestra el mensaje
     * “sos de morón”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato= new Scanner(System.in);
        String Nombre,Sexo,Localidad;
          
            System.out.println("Ingrese Nombre:");
            Nombre= traerDato.next();
        
            System.out.println("Ingrese Si es Femenino o Masculino:");
            Sexo= traerDato.next();
        
            System.out.println("Ingrese Su Localidad:");
            Localidad= traerDato.next();
            
            if(Nombre.equals("jose")||Nombre.equals("maria"))    
                {
                    if(Sexo.equals("masculino"))
                     {
                        if(Localidad.equals("moron"))
                        {
                             System.out.println("Sos de Moron");
                        }
                     }
                }
            
                 
    }
    
    
}

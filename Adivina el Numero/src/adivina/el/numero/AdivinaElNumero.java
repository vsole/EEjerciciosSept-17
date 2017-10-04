/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina.el.numero;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato = new Scanner(System.in);
        Integer numeroSecret;
        Integer numero;
        Integer diferencia;
        String datoAux;
        
        numeroSecret = (int) (Math.random()*10) + 1;
        System.out.println("El numero secreto es: "+numeroSecret);
                
        System.out.println("Ingrese un numero");
        datoAux = traerDato.next();
        numero = Integer.parseInt(datoAux);
        
        
        
        //DatoAux = traerDato.next();
        diferencia = Integer.parseInt(datoAux);
        
        if(numero.equals(numeroSecret))
        {
            System.out.println("Acerto al numero");
        }else
        {
            if (numero>numeroSecret || numero<numeroSecret)
            {
                System.out.println("Te pasaste");
                switch(numero - numeroSecret)
                {
                    case 1:
                        System.out.println("Casi casi");
                        break;
                    case 2:
                        System.out.println("Cerca");
                        break;
                    case 3:
                        System.out.println("Ni cerca");
                        break;
                    case 4:
                        System.out.println("Bien lejos");
                        break;
                    default:
                        System.out.println("Sos horrible en este juego");
                }
                if (numero<numeroSecret)
                {
                System.out.println("Te faltó");
                switch(numeroSecret - numero)
                {
                    case 1:
                        System.out.println("Casi casi");
                        break;
                    case 2:
                        System.out.println("Cerca");
                        break;
                    case 3:
                        System.out.println("Ni cerca");
                        break;
                    case 4:
                        System.out.println("Bien lejos");
                        break;
                    default:
                        System.out.println("Sos horrible en este juego");
                }
                diferencia = numero - numeroSecret;
                switch(numeroSecret - numero)
                {
                    case -1:
                    case 1:
                        System.out.println("...");
                        break;
                }   
                }                                                                                                       
            }

   
    
        }

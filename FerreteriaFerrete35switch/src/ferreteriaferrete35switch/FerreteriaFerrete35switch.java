/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaferrete35switch;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class FerreteriaFerrete35switch {

    /**
     * @param args the command line arguments
      Debemos hacer una serie de aplicaciones para este negocio
	35- Las lámparas están al mismo precio de $35 pesos final. 
        A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
        B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un 
        * descuento del 40 % y si es de otra marca el descuento es del 30%. 
        C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o 
        * “FelipeLamparas” se hace un descuento del 25 % y si es de otra marca
        * el descuento es del 20%. 
        D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento
        * es del 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si
        * es de otra marca un 5%. 
        * E. Si el importe final con descuento suma más de $120 se debe sumar
        * un 10% de ingresos brutos en informar del impuesto con el siguiente
        * mensaje:”IIBB Usted pago X”, siendo X el impuesto que se pagó. 

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato = new Scanner(System.in);
        
        
        Integer precioLamparas=35;
        Integer canLamparas;
        String auxCantidad;
        String marca;
        Integer PrecioBruto;
        Double PrecioFinal=(double)0;
        Double PrecioConIIBB;
        Double IIBB;
        
        System.out.println("Ingrese la marca que desea comprar");
        marca = traerDato.next();
        
        System.out.println("Ingrese el número de lamparas que compra");
        auxCantidad = traerDato.next();
        canLamparas = Integer.parseInt(auxCantidad);
        
        PrecioBruto = canLamparas * precioLamparas;
        
        if(canLamparas>5)
        {
            PrecioFinal = PrecioBruto * 0.5;
            System.out.println("Debe pagar " + PrecioFinal);
        }else
        {    //los menores a 6
            if(canLamparas==5)
            {
            if(marca.equals("ArgentinaLuz"))
            {
                PrecioFinal = PrecioBruto * 0.6; 
            }
            else
            {
                PrecioFinal = PrecioBruto * 0.7;
            }
            }
            else
            {
                //todos los menores a 5
                if(canLamparas==4)
                {
                    if (marca.equals("ArgentinaLuz") || marca.equals("FelipeLamparas")) 
                    {
                        PrecioFinal = PrecioBruto * 0.75;
                    }else {
                        PrecioFinal = PrecioBruto * 0.80;
                    }
                }
        }
            if (canLamparas==3) {
                if (marca.equals("ArgentinaLuz")) {
                    PrecioFinal = PrecioBruto * 0.85;
                }
                else
                {
                    if (marca.equals("FelipeLamparas")) {
                        PrecioFinal = PrecioBruto * 0.90;
                    }else
                    {
                        PrecioFinal = PrecioBruto * 0.95;
                    }
                }
            }
            
            if (PrecioFinal<120) 
                {
                System.out.println("Debe pagar " + PrecioFinal);
            }
            else
            {
                PrecioConIIBB = PrecioFinal * 1.10;
                IIBB = PrecioConIIBB - PrecioFinal;
                System.out.println("Usted pagó " + PrecioConIIBB + " siendo " + IIBB + " el impuesto que pagó");
            }
  
       
        
        
        
        
        
        
        }
    
}
} 


        
        
       
        
   
    


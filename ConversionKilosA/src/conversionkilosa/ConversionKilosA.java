/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionkilosa;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ConversionKilosA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean GG=false;
        Scanner Leer = new Scanner(System.in);
        Scanner LeerN = new Scanner(System.in);
        int y;
        do {
        int C=0, C1=0,Cos=0, x=0,Res=0;
        String Let="",Cad="";
        System.out.println ("Este programa convierte distintas Magnitudes en otras"
                );
        
        System.out.println ("Escribe el sistema a convertir"+ "\nOpcion 1: Kilos A Libras"
                + "\nOpcion 2: Litros a Onzas"
                + "\nOpcion 3: Kilometros A Yardas"
        + "\nOpcion 4: Metros a Millas"
        + "\nOpcion 5: Finalizar");
        C = Leer.nextInt();
        System.out.println ("Escribe las cantidad a convertir (Solo Enteros)");
        C1 = Leer.nextInt();
        
        switch (C){
            case 1: {
                
                System.out.println ("El valor de "+C1+" Kilos en Libras es de: "+C1*0.453592+"\n");
                break;}
            case 2: {
                
                System.out.println ("El valor de "+C1+" Litros en Onzas es de: : "+C1*33.81+"\n");
                break;}
            case 3: {
                
                System.out.println ("El valor de "+C1+" Kilometros en Yardas es de: : "+C1*1093.61+"\n");
                break;}
            case 4: {
                
                System.out.println ("El valor de "+C1+" Metros a Millas es de: : "+C1*0.000621371+"\n");
                break;}
            case 5:{System.out.println ("Finalizando el programa");}
           
            
        }
        y=C;
        } while(y!=5); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionpesosa;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ConversionPesosA {

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
        System.out.println ("Este programa convierte pesos a otras monedas"
                );
        System.out.println ("Escribe las cantidad a convertir (Solo Enteros)");
        C1 = Leer.nextInt();
        System.out.println ("Escribe el sistema a convertir"+ "\nOpcion 1: Dolares"
                + "\nOpcion 2: Euros"
                + "\nOpcion 3: Yenes"
        + "\nOpcion 4: Libra Esterlina"
        + "\nOpcion 5: Finalizar");
        C = Leer.nextInt();
        
        switch (C){
            case 1: {
                
                System.out.println ("El valor en Dolares es de: "+C1*0.051+"\n");
                break;}
            case 2: {
                
                System.out.println ("El valor en Euros es de: : "+C1*0.046+"\n");
                break;}
            case 3: {
                
                System.out.println ("El valor en Yenes es de: : "+C1*5.48+"\n");
                break;}
            case 4: {
                
                System.out.println ("El valor en Libras Esterlina es de: : "+C1*0.042+"\n");
                break;}
            case 5:{System.out.println ("Finalizando el programa");}
           
            
        }
        y=C;
        } while(y!=5); 
    }
    
}

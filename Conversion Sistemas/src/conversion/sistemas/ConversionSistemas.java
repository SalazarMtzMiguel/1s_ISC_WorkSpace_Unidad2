/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion.sistemas;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ConversionSistemas {

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
        System.out.println ("Este programa convierte numeros decimales a numeros enteros \nFinaliza al ingresar cero en la cantidad"
                );
        System.out.println ("Escribe las cantidad a convertir (Solo Enteros)");
        C1 = Leer.nextInt();
        System.out.println ("Escribe el sistema a convertir"+ "\nOpcion 1: Binario"
                + "\nOpcion 2: Octal"
                + "\nOpcion 3: Hexagesimal"
        + "\nOpcion 4: Finalizar");
        C = Leer.nextInt();
        
        switch (C){
            case 1: {
                do {
                Cos=(C1/2);
                Res=(C1%2);
                C1=Cos;
                Cad=Res+Cad;
                } while(Cos!=0);
                System.out.println ("Este es el resultado en Binario: "+Cad+"\n"+"\n");
                break;}
            case 2: {
                do {
                Cos=(C1/8);
                Res=(C1%8);
                C1=Cos;
                Cad=Res+Cad;} while(Cos!=0);
                System.out.println ("Este es el resultado en Octal: "+Cad+"\n"+"\n");
                break;}
            case 3: {
                do {
                Cos=(C1/16);
                Res=(C1%16);
                C1=Cos;
                Let="";
                switch (Res) {
                    case 0:{Let="0"; break;}
                    case 1:{Let="1";break;}
                    case 2:{Let="2";break;}
                    case 3:{Let="3";break;}
                    case 4:{Let="4";break;}
                    case 5:{Let="5";break;}
                    case 6:{Let="6";break;}
                    case 7:{Let="7";break;}
                    case 8:{Let="8";break;}
                    case 9:{Let="9";break;}
                    case 10:{Let="A";break;}
                    case 11:{Let="B";break;}
                    case 12:{Let="C";break;}
                    case 13:{Let="D";break;}
                    case 14:{Let="E";break;}
                    case 15:{Let="F";break;}
                    
                }
                Cad=Let+Cad;} while(Cos!=0);
                System.out.println ("Este es el resultado en Hexagesimal: "+Cad+"\n"+"\n");
                break;}
            case 4:{System.out.println ("Finalizando el programa");}
           
            
        }
        y=C;
        } while(y!=4); 
                
    }
    
}

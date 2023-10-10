/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varias.opciones;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class VariasOpciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner In = new Scanner(System.in);
        Scanner In2 = new Scanner(System.in);
        int M=0, C, x,A=0,B=1,Z=0,Mul=1;
        String Cad = "";
        do{
        System.out.println("1.- Determinar si un Año es Bisiesto\n"
                + "2.-Determinar Sucesion de Fibonacci con cantidad mas cercana al numero ingresado\n"
                + "3.-Leer Numero y calcular factorial sies impar\n"
                + "4.-Salir");
        M = In.nextInt();
        switch (M){
            
            case 1:{
            System.out.println("Ingresa el año, para determinar si es o no bisiesto");
            C = In2.nextInt();
            if((C%4)==0){
                System.out.println(C+" Es bisiesto");}else{System.out.println(C+" No es Bisiesto"+"\n");}
            break;}
            case 2:{
            System.out.println("Ingrese un numero, la sucesion terminara con un numero aproximado");
            C = In2.nextInt();
            for (x=0; Z<=C; x++){
                Z=A+B;
                A=B;
                B=Z;
                Cad=Cad+","+A;
                
            }
            System.out.println("0"+Cad+"\n");
            break;}
            case 3:{
            System.out.println("Ingrese un numero, se calculara el factorial si es un numero impar");
            C = In2.nextInt();
            if((C%2)!=0){
            for (x=1; x<=C; x++){
            Mul=Mul*x;
            }
            System.out.println(Mul+" Es el factorial de: "+ C+"\n");
            }break;}
            case 4:{System.exit(0); break;}}  }while(M!=4);  
    }
    
}


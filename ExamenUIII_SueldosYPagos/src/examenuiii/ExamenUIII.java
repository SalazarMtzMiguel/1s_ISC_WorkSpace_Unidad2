/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuiii;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ExamenUIII {

     //* @param args the command line arguments
     //*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer = new Scanner(System.in);
        Scanner LeerN = new Scanner(System.in);
        Scanner In = new Scanner(System.in);
        Scanner In2 = new Scanner(System.in);
        int M=0, C=0,C2=0, x,A=0,B=1,Z=0,Mul=1;
        String Cad = "";
        do{
            
            
        System.out.println("¿Que deseas hacer?\n"
                + "1.-Determinar SALARIO BRUTO\n"
                + "2.-Determinar el pago al IMSS\n"
                + "3.-Determinar pago an INFONAVIT\n"
                + "4.-Calcular pago al ISR\n"
                + "5.-Calcular PAGO NETO\n"
                + "6.-Volver a MOSTRAR un PAGO anterior\n"
                + "7.-Salir");
        M = In.nextInt();
        if(M==7){System.exit(0);}
        
        if (A<1&&M==6){ A=-1;
        System.out.println("No puedes realizar esta accion");}else{if(M==6){}else{
                System.out.println("Ingresa el pago por hora");
            C = In2.nextInt();
            System.out.println("Ingresa el total de horas trabajadas");
            C2 = LeerN.nextInt();}}
        
        
        
            int BRUTO = C*C2;
            double IMSS = (C*C2)*.04;
            double INFONAVIT = (C*C2)*.02;
            double ISR = (C*C2)*.25;
            double NETO = BRUTO-IMSS-INFONAVIT-ISR;
        
        switch (M){
            
            case 1:{
            
            System.out.println("Tu salario Bruto es de: "+BRUTO);
            break;}
            case 2:{
            System.out.println("Tu al IMSS es de: "+IMSS);
            break;}
            case 3:{
                System.out.println("Tu pago al INFONAVIT es de: "+INFONAVIT);
            break;}
            case 4:{
            System.out.println("Tu pago al ISR es de: "+ISR);
            break;}
            case 5:{
            System.out.println("Tu salario Bruto es de: "+NETO);
            break;}
            
            case 6:{
            if(A>0){System.out.println("¿Que deseas VOLVER A IMPRIMIR?\n"
                + "1.-SALARIO BRUTO\n"
                + "2.-Pago al IMSS\n"
                + "3.-Pago INFONAVIT\n"
                + "4.-Pago al ISR\n"
                + "5.-PAGO NETO");
            int M2 = In.nextInt();
            switch (M2){
            
            case 1:{
            
            System.out.println("Tu salario Bruto es de: "+BRUTO);
            break;}
            case 2:{
            System.out.println("Tu al IMSS es de: "+IMSS);
            break;}
            case 3:{
                System.out.println("Tu pago al INFONAVIT es de: "+INFONAVIT);
            break;}
            case 4:{
            System.out.println("Tu pago al ISR es de: "+ISR);
            break;}
            case 5:{
            System.out.println("Tu salario Bruto es de: "+NETO);
            break;}}}
            break;}
            case 7:{System.exit(0); break;}
            default:{
                System.out.println("Vuelve a intentarlo");break;}
        }  
            
        A=A+1;
        }while(M!=7);  
    }
    
}

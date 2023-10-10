/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuiii2;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ExamenUIII2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        Scanner LeerN = new Scanner(System.in);
        Scanner In = new Scanner(System.in);
        Scanner In2 = new Scanner(System.in);
        int M=0, C=0,C2=0, x,A=10000000,B=0,Z=-1,Mul=1,Max=0,Min=2140000000,Sum=0;
        String Cad = "",Nombre,NM="",Nm="";
        
        
        do{
            Sum=0;
            System.out.println("¿Que deseas hacer?\n"
                + "1.-Calificacion de niños\n"
                + "2.-Ingresa Numeros Diferentes a cero\n"
                + "3.-Finalizar"
                );
            M = In.nextInt();
        if(M==3){System.exit(0);}
        switch (M){
            
            case 1:{
            for (x=1; x<=5; x++){
                System.out.println("Escribe el nombre del alumno");
                Nombre = Leer.next();
                System.out.println("Escribe su calificacion");
                B=LeerN.nextInt();
                if(B<Min){Min=B;Nm=Nombre;}
                if(B>Max){Max=B;NM=Nombre;}
                Sum=Sum+B;
                
}
                System.out.println("El mejor alumno fue: "+NM+" con "+Max+"\n"
                        + "El Peor Alumno fue: "+ Nm+" con "+Min+"\n"
                        + "El Promedio de los 5 niños fue: "+Sum/5);
            
            break;}
            case 2:{
                System.out.println("Ingresa los numero separados por un enter (finaliza con cero)");
            do {
                A = In.nextInt();
                Sum=Sum+A;
                Z=Z+1;
                if(A<Min&&A!=0){Min=A;}
                if(A>Max){Max=A;}
            } while(A!=0);
                System.out.println("El Mayor Numero fue: "+Max+"\nEl Menor numero fue: "+Min+"\nEl Promedio fue: "
                        + Sum/Z);
            break;}
            case 3:{
                
            break;}
            
            default:{
                System.out.println("Vuelve a intentarlo");break;}}
        
        }while(M!=3);
    }
    
}

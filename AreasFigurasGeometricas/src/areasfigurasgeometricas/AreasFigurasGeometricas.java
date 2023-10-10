/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasfigurasgeometricas;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class AreasFigurasGeometricas {

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
            C=0;A=0;
        System.out.println("Que area desea Calcular\n"
                + "1.-Triangulo\n"
                + "2.-Circulo\n"
                + "3.-Hexagono\n"
                + "4.-Decagono\n"
                + "5.-Salir");
        M = In.nextInt();
        switch (M){
            
            case 1:{
            System.out.println("Ingresa la medida de la base");
            C = In2.nextInt();
            System.out.println("Ingresa la medida de la altura");
            A = In2.nextInt();
                System.out.println("El area es: "+(A*C/2));
            break;}
            case 2:{
            System.out.println("Ingresa la medida del radio");
            C = In2.nextInt();
            
                System.out.println("El area es: "+(C*C*3.1416));
            break;}
            case 3:{
            System.out.println("Ingresa la medida del Perimetro");
            C = In2.nextInt();
            System.out.println("Ingresa la medida del Apotema");
            A = In2.nextInt();
            System.out.println("El area es: "+(A*C/2));
            break;}
            case 4:{
            System.out.println("Ingresa la medida del Perimetro");
            C = In2.nextInt();
            System.out.println("Ingresa la medida del Apotema");
            A = In2.nextInt();
            System.out.println("El area es: "+(A*C/2));
                break;}
            case 5:{System.exit(0); break;}} 
            System.out.println("\n");
        }while(M!=5);  
    }
    
}

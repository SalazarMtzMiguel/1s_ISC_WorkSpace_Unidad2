/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnopromedad;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class AlumnoPromEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        int x,edad,y;
        Double cal=0.0,prom=0.0;
        Double suma=0.0;
        
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        
        for(x=1;x<=10;x++){
            System.out.println("Escribe el nombre del alumno " + x);
            nom=leer.nextLine();
            System.out.println("Escribe su edad (alumno " + x+")");
            edad=leer1.nextInt();
            suma=0.0;
            cal=0.0;
            for(y=1;y<=4;y++){
            System.out.println("Escribe la calificacion " + y);
            cal=leer1.nextDouble();
            suma=suma+cal;   
        }
         prom=suma/4;
         System.out.println("El promedio del alumno " + nom + " de " + edad + " Años, " + "Es de: "  + prom+"\n");
        }
    }
    
}

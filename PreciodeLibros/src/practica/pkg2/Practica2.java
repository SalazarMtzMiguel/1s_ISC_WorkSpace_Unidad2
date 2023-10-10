/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class Practica2 {
    public static Double  Sum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner Leer = new Scanner(System.in);
    Scanner LeerN = new Scanner(System.in);
    int x, y;
    String Cad="", Nom;
    Sum=0.0;
    for (x=1; x<=10; x++){
    int Pag=0;    
    Double Precio= 0.0;
    System.out.println ("Escribe el nombre del libro "+x);
     Nom = LeerN.next();
     System.out.println ("Escribe las paginas del libro "+x);
     Pag = Leer.nextInt();
     if (Pag<=150){
     Precio=70.0+(.8*Double.valueOf(Pag));
     }
     
     if (Pag<=200&&Pag>150){
     Precio=70.0+(.80*Double.valueOf(Pag))+(.50*(Double.valueOf(Pag)-150));}
     
     if (Pag>200){
     Precio=70.0+(.80*Double.valueOf(Pag))+(.50*(Double.valueOf(Pag)-150))+
             (.30*(Double.valueOf(Pag)-200));}
     Sum=Sum+Precio;
     System.out.println ("El precio de "+Nom +" (libro "+x+") es de :"+Precio+"\n");
    }
    System.out.println ("La ganancia total es de: "+Sum+"\n");
        
        

    }
    
}

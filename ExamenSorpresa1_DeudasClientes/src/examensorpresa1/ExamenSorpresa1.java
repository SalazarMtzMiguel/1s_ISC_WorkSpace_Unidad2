/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa1;
import java.util.*;

/**
 *
 * @author Mikec
 */
public class ExamenSorpresa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
     int x, y;
    String Cad="", Nom;
        
    Scanner Leer = new Scanner(System.in);
    Scanner LeerN = new Scanner(System.in);
    for (x=1; x<=10; x++){
    int Deu=0,Fec=0;    
    Double Inc= 0.0, Final=0.0;
    System.out.println ("Escribe el nombre del Cliente "+x);
     Nom = LeerN.next();
     System.out.println ("Escribe la deuda del cliente "+x);
     Deu = Leer.nextInt();
     System.out.println ("Escribe el dia de pago del cliente "+x);
     Fec = Leer.nextInt();
     Inc=(Double.valueOf(Deu)*5/100);
     if (Fec<=10){
         if (Inc<=100){
             Final=Deu-Inc;
         }else{Final=Deu-100.0;}
     }
     if (Fec>10&&Fec<20){
         Final=Double.valueOf(Deu);
     }
     if (Fec>=20){
         if (Inc<=100){
             Final=Deu+100.0;
         }else{Final=Deu+Inc;}
     }
     
     System.out.println ("El Total a Pagar de "+Nom +" (Cliente "+x+") es de :"+Final+"\n");
    }
    }
    
}

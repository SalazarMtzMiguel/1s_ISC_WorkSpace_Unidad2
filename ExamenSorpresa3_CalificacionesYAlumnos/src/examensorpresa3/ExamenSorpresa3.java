/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa3;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ExamenSorpresa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer = new Scanner(System.in);
        Scanner LeerN = new Scanner(System.in);
        
        int a=0, x, y;
        
        String Cad="",Cad1="",Cad2="", Nom;
        for (x=1; x<=5; x++){
            System.out.println ("Escribe el nombre del Alumno "+x);
            Nom = LeerN.next();
            System.out.println ("Escribe las 5 calificaciones del Alumno separadas por un enter");
            Double Cal=0.0,Sum=0.0;
        for (y=1; y<=5; y++){
            System.out.println ("Escribe la calificacion de la unidad "+y);
            Cal = Leer.nextDouble();
            Sum=Sum+Cal;
            if (y==2){
            if (Cal<7){
                Cad1=Cad1 +(Nom+" Reprobo la unidad 2 con : "+(Cal)+"\n");
            }}
            if (y==4){
            if (Cal>=9){
                Cad2=Cad2 +(Nom+" Aprobo la unidad 4 con calificacion mayor o igual a 9 ("+(Cal)+")\n");
            }}
            
        }
        if ((Sum/5)>=9){a=a+1;}
        Cad= (Nom+" Obtuvo un promedio de: "+(Sum/5)+"\n");
    }
        System.out.println (Cad+Cad1+Cad2+"\nEn total solo "+a+" aprobaron igualando o superando la calificacion de 9");
    }
    
}

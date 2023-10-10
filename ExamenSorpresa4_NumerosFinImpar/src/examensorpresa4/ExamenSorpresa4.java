/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa4;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class ExamenSorpresa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int C, M=0,m=100000,Sum=0,Count=0, x=0;
        boolean GG=false;
        
        do {
        System.out.println ("Escribe las cantidades separadas por un enter");
        C = Leer.nextInt();
        Sum=Sum+C;
        Count=Count+1;
        if ((C%2)==0){
            if (C<m){m=C;}
            if (C>M){M=C;}
            
            
        }else{
           GG=true; 
           x=x+1;
           System.out.println ("Ejecucion Finalizada");
        }
        } while(x==0); 
        System.out.println ("El total de numeros es:"+Count+"\nEl Mayor numero fue: "+M+
                "\nEl Menor numero fue: "+m+"\nEl promedio fue: " + (Sum/Count));
        
    }
    
}

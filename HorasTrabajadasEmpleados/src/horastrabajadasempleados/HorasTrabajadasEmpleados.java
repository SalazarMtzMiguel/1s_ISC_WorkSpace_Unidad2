/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horastrabajadasempleados;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class HorasTrabajadasEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0,Hrs=0;
        double pago=0;
        int pxh=0;
        double T=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuanto deseas pagar por hora");
        pxh=leer.nextInt();
        
        for(x=1;x<=5;x++){
            System.out.println("Ingresa la cantidad de horas trabajadas por el trabajador" + " " + x + " ");
            Hrs=leer.nextInt();
            
            if(Hrs<=40){
                pago=Hrs*pxh;
                System.out.println("Debes Pagar: " + pago);
            }
            if(Hrs>40 && Hrs<=50){
                pago=Hrs*(pxh*2);
                System.out.println("Debes Pagar: " + pago);
            }
            if(Hrs>50){
                pago=Hrs*(pxh*3);
                System.out.println("Debes Pagar: " + pago);
            }
            T=T+pago; 
        }     
        System.out.println("Pago por todos los trabajadores con un Total de: " + T);
    }
    
}

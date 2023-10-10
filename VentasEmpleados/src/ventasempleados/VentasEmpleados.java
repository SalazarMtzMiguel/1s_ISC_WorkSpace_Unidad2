/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasempleados;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class VentasEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0,y=0,C;
        double Mont=0,paga=0,SumPaga=0,T=0;
        
        Scanner Leer = new Scanner(System.in);
        
        for(x=1;x<=10;x++)
        {
            System.out.println("Ingresa la cantidad de ventas del empleado " + x);
            C=Leer.nextInt();
            SumPaga=0;
            for(y=1;y<=C;y++){
                System.out.println("Ingresa el monto de la venta " + y);
                Mont=Leer.nextDouble();
                
                if(Mont<=1000){
                    paga=100;
                }else{
                    paga=Mont*.15;
                }
                SumPaga=SumPaga+paga;
            }
            System.out.println("El Empleado " + x + " Gano un total de: " + SumPaga+"\n");
            T=T+SumPaga;
        }
        System.out.println("El pago total de los trabajadores es de: " + T);
    }
    
}

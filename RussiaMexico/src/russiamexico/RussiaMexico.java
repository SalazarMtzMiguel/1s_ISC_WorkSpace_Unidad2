/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russiamexico;

/**
 *
 * @author Mikec
 */
public class RussiaMexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Mex=120000000,Rus=100000000;
        double C=0,Year=0,D=0;
        
        while (Rus<=Mex)
        {
            Mex=Mex+Mex*0.03;
            Rus=Rus+Rus*0.05;
            C=C+1;
        }
        System.out.println("Rusia tardara " + C + " años en superar la poblacion de Mexico");
        Year=2019+C;
        System.out.println("La rebasara en el año " + Year);
        System.out.println("La poblacion de Mexico sera de: " + Mex + " Y La poblacion de Rusia de: " + Rus);
        D=Rus-Mex;
        System.out.println("Con una diferencia de: " + D + " personas (ignore los decimales)");
    }
    
}

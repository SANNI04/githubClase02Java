/* Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
teclado. */
package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
            float ms=0;
            System.out.println("Convertidosr de km/h a m/s");
            System.out.println("Ingrese la velocidad en km/h: ");
            int km=entrada.nextInt();
            ms= (float) (km/3.6);
            System.out.println("Kilometros por hora: "+km);
            System.out.println("Metros por segundo: "+ms);
    }
    
}

/*. Programa que lea por teclado tres números enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y
comprueba si la hora que indican es una hora válida. */

package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);

        System.out.println("Ingrese la hora acontinuació de acuerdo a las instrucciones: ");
        System.out.println("Hora (de 00 a 24)-> ");
        int H=entrada.nextInt();
        System.out.println("Minutos (de 00 a 60) -> ");
        int M=entrada.nextInt();
        System.out.println("Segundos (de 00 a 60");
        int S= entrada.nextInt();

        if (H>=0 && H<=24 && M>=0 && M<=60 && S>=0 && S<=60) {
        System.out.println("La hora: "+H+":"+M+":"+S+" es valida");
        }
        else{
        System.out.println("La hora ingresada no es valida");
        }
    }
}

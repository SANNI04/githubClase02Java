/* El programa lee por teclado tres números enteros y calcula y
muestra el mayor de los tres */

package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class eje9 {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
   
    System.out.println("Ingrese tres numeros para encontrar el mayor: ");
    System.out.println("Numero 1: ");
    int a=entrada.nextInt();
    System.out.println("Numero2: ");
    int b=entrada.nextInt();
    System.out.println("Numero3: ");
    int c=entrada.nextInt();

    if (a>b & a>c){
        System.out.println(a+" Es el mayor");
    }
    else if(b>a & b>c){
        System.out.println(b+" Es el mayor");
    }
    else if(c>a & c>b){
        System.out.println(c+" Es el mayor");
    }
    else{
        System.out.println("Los tres numeros ingresados son iguales");
    }
}
}



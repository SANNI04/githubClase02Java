/* Programa que lea dos números por teclado y muestre el
resultado de la división del primer número por el segundo. Se
debe comprobar que el divisor no puede ser cero.
 */
package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float a=entrada.nextFloat();
      
        System.out.println("Ingrese un numero: ");
        float b=entrada.nextFloat();

        if (b!=0){
            float division= a/b;
            System.out.println(division);
        }
        else{
            System.out.println("No se puede dividir entre 0");
        }
    
        entrada.close();

    }
}

//CON UNA FUNCIÓN: 
/*
System.out.println("Ingrese un primer numero: ");
float a=entrada.nextInt();

System.out.println("Ingrese un segundo numero: ");
float b=entrada.nextInt();

division(a,b);
}

public static Float division (float a,float b){

    float resultado;
    if (b!=0){
    resultado= a/b;
    }
    else{
        System.out.println("No se puede dividir entre 0");
    }  
    return resultado;}
}
    }
*/


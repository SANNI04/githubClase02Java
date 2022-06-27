/* Programa que lea un carácter por teclado y compruebe si es
una letra mayúscula.
*/
package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
public class eje6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 /*    System.out.println("Ingrese una letra: ");
    char letra = entrada.next().charAt(0);
    
    
        if (Character.isUpperCase(letra)){ /// Character.isUpperCase() es una funcion que se utiliza para saber si una letra es mayuscula
            System.out.println("La letra "+letra+" esta en MAYUSCULA");
        }
        else if (Character.isLowerCase(letra)){
            System.out.println("La letra "+letra+" esta en minuscula");
        }
        else{
            System.out.println("El caracter ingresado no es una letra");
        }
        entrada.close();
*/
//EN UNA FUNCIÓN:

        System.out.println("Ingrese una letra: ");
        char letra = entrada.next().charAt(0);

        String resultado="";
        mayusminus(letra,resultado);

}
    public static String mayusminus(char letra,String resultado){;

        if (Character.isUpperCase(letra)){ /// Character.isUpperCase() es una funcion que se utiliza para saber si una letra es mayuscula
            System.out.println("La letra "+letra+" esta en MAYUSCULA");
        }
        else if (Character.isLowerCase(letra)){
            System.out.println("La letra "+letra+" esta en minuscula");
        }
        else{
            System.out.println("El caracter ingresado no es una letra");
        }
    return resultado;
    }
}
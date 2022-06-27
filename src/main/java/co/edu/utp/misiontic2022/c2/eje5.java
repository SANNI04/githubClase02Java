package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje5 {

public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
/*  int resultado=0;
    System.out.println("Ingrese un numero: ");
    int n1=entrada.nextInt();

    resultado=n1%10;
    if (resultado==0){
        System.out.println("El numero "+n1+" es multiplo de 10");
    }
    else{
        System.out.println("El numero "+n1+" no es multiplo de 10");
    }

    entrada.close();
*/   
    //CON UNA FUNCIÓN:
    
    System.out.println("Ingrese un numero: ");
    int n1=entrada.nextInt();

    int proceso = multiplo10(n1); 

}

    public static int multiplo10 (int n1){ 
    int proceso = n1%10;
    if (proceso==0){
        System.out.println("El numero "+n1+" es multiplo de 10");
    }
    else{
        System.out.println("El numero "+n1+" no es multiplo de 10");
    }

    return proceso;

    }
}

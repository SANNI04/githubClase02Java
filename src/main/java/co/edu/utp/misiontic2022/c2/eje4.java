package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class eje4 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
/* 
    int suma=0;

    System.out.println("Ingrese la longitud de los catetos del triangulo rectangulo: ");
    System.out.println("Primera longitud: ");
       int a=entrada.nextInt();
       System.out.println("segunda longitud: ");
       int b=entrada.nextInt();
    entrada.close();

    suma= (int) (Math.pow( a, 2)+ (int) Math.pow(b, 2));
    System.out.println("La longitud de la hipotenusa del triangulo rectangulo es: "+ (int)(Math.sqrt(suma)));
 */  

//CON UNA FUNCIÓN:


int c=0;

System.out.println("Ingrese la longitud de los catetos del triangulo rectangulo: ");
System.out.println("Primera longitud: ");
   int a=entrada.nextInt();
   System.out.println("segunda longitud: ");
   int b=entrada.nextInt();

   int resultado= hipotenusa(a,b,c);
   System.out.println("La longitud de la hipotenusa del triangulo rectangulo es: "+ resultado);
}
    public static int hipotenusa(int a,int b,int c){
        
    c= (int) (Math.pow( a, 2)+ (int) Math.pow(b, 2));
    int resultado=(int)(Math.sqrt(c));
    return resultado;
   
    }
}

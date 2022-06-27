/* Programa que lea dos variables enteras N y m y le quite a N sus m últimas
cifras.
Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234 */
package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class eje3 {
public static void main( String[] args ){
    Scanner entrada=new Scanner(System.in);

    System.out.println("Ingrese un numero: ");
    int N=entrada.nextInt();

    System.out.println("Ingrese un segundo numero: ");
    int m=entrada.nextInt();
    //    N= N /(int)(10^m); no funciona asi porque ^ es otro operador diferente, para hacerlo necesitamos el metodo pow del objeto .math
    N= N / (int)Math.pow(10, m);    // N es igual a N dividido en 10 a la m y como se define entero no muestra los decimales cuando se divide en 10 ,100, 1000, 10000 etc se van quitande de a unoa dos o tres cifras 
    System.out.println(N);
    entrada.close();   
    }
}
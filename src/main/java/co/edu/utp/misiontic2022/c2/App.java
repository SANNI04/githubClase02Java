/* Programa que pida por teclado la fecha de nacimiento de una persona 
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha 
de nacimiento y a continuación sumando las cifras obtenidas en la suma */

package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner entrada = new Scanner(System.in);
        System.out.println( "Ingrese su fecha de nacimiento: " );
        String fecha = entrada.nextLine();
        
        int suma= numerosuerte(fecha);
        
        System.out.println("Su numero de suerte es:"+ suma);
        
    entrada.close();
   
    }
        public static int numerosuerte(String fecha){
           
           String n1=(fecha.substring(0,2));
           String n2=(fecha.substring(3,5));
           String n3=(fecha.substring(6,10));
           int v1 = Integer.parseInt (n1);
           int v2 = Integer.parseInt (n2);
           int v3 = Integer.parseInt (n3);

           int resultado= v1+v2+v3;
           
           int x1=((resultado-resultado %1000)/1000)%10;
           int x2=((resultado-resultado%100)/100)%10;
           int x3 = ((resultado-resultado % 10)/10)%10;
           int x4 = resultado % 10; 
           
           int suma =x1+x2+x3+x4;
           return suma;
    }

}

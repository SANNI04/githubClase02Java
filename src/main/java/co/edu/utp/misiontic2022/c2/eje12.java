/*Realizar programa que muestre los números del 1 al 100 que no
sean múltiplos de 3, utilizando cada una las instrucciones
repetitivas (while, do while, for */
package co.edu.utp.misiontic2022.c2;

public class eje12 {
    public static void main(String[] args) {
        
        for (int i=1;i<=100;i++){
            if (i % 3 != 0){
            System.out.println(i);
            } 
        }
System.out.println();
    
        int i=1;
        while (i<=100){
            if (i %3 !=0){
                System.out.println(i);
            }
        i++;
        }
System.out.println();

        i=1;
        do {
            if (i%3!=0){
            System.out.println(i);}
            i++;
        }while (i<=100); 
    }  
}

    
    

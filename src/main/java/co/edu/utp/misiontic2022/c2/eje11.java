package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de mes del que desea obtener información: ");
        int mes=entrada.nextInt();

        //if (mes >=1 && mes<=12){

        switch(mes){

            case 1:
                System.out.println("Enero tiene 31 dias.");
            break;
            case 2:
                System.out.println("Febrero tiene 28 dias.");
            break;
            case 3:
                System.out.println("Marzo tiene 31 dias.");
            break;
            case 4:
                System.out.println("Abril tiene 30 dias.");
            break;
            case 5:
                System.out.println("Mayo tiene 31 dias.");
            break;
            case 6:
                System.out.println("Junio tiene 30 dias.");
            break;
            case 7:
                System.out.println("Julio tiene 31 dias.");
            break;
            case 8:
                System.out.println("Agosto tiene 31 dias.");
            break;
            case 9:
                System.out.println("Septiembre tiene 30 dias.");
            break;
            case 10:
                System.out.println("Octubre tiene 31 dias.");
            break;
            case 11:
                System.out.println("Noviembre tiene 30 dias.");
            break;
            case 12:
                System.out.println("Diciembre tiene 31 dias.");
            break;
            default:
                System.out.println("El año solo tiene de 1 a 12 meses");
            break;
        }   
    }
}
    

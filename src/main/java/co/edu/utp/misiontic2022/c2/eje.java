package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class eje {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
/*         
        float precioConIva=0;
            System.out.println("Ingrese la cantidad de productos vendidos: ");
            int cantidad=sc.nextInt();
            System.out.println("Ingrese el precio del producto sin iva por unidad: ");
            float preSinIva=sc.nextFloat();
            System.out.println("Ingrese el valor del iva que se va a aplicar: ");
             int iva = sc.nextInt();
           
           precioConIva=preSinIva+preSinIva*iva/100;          
            System.out.println("Cantidad de productos vendidos: "+cantidad);
            System.out.println("Porcentaje de iva aplicado: "+iva);
            System.out.println("Precio venta c/u: "+precioConIva);
*/         
    //CON UNA FUNCIÓN:

    
    System.out.println("Ingrese la cantidad de productos vendidos: ");
    int cantidad=sc.nextInt();
    System.out.println("Ingrese el precio del producto sin iva por unidad: ");
    float preSinIva=sc.nextFloat();
    System.out.println("Ingrese el valor del iva que se va a aplicar: ");
    int iva = sc.nextInt();
      
        float precioConIva= calculateconIVA(preSinIva, iva,cantidad);

    System.out.println("Cantidad de productos vendidos: "+cantidad);
    System.out.println("Porcentaje de iva aplicado: "+iva);
    System.out.println("Precio venta c/u: "+precioConIva);
 sc.close();    
}

    public static float calculateconIVA (float preSinIva,int iva,int cantidad) {


        float precioConIva=preSinIva+preSinIva*iva/100; 
        //float precioTotalIva = precioConIva*cantidad;

        return precioConIva;
    }
      
}
        
            

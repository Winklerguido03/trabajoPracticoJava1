import java.util.Scanner;

public class Ej4_ticket {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] nombres;
        nombres =new String[3];

        byte [] unidades;
        unidades= new byte [3];

        double [] precios;
        precios= new double[3];

        double [] precioTotal;
        precioTotal= new double[3];

        for (byte i=0;i<3;i++){
            System.out.println("Ingrese los datos del producto N°" + (i+1));
            System.out.println("Nombre del producto");
            nombres[i]=sc.next();
            System.out.println("Ingrese cuantas unidades compra");
            unidades[i]= sc.nextByte();
            System.out.println("Ingrese el precio unitario de su producto");
            precios[i]=sc.nextDouble();
            precioTotal[i]=precios[i]+unidades[i];
        }
        double costoTotalTicket;
        costoTotalTicket=(precioTotal[0]+precioTotal[1]+precioTotal[2]);

        System.out.println("====Ticket====");
        System.out.println("Productos Unidades Precio/Unidad Total");
        for (byte i=0;i<3;i++){
            System.out.println(nombres[i] + "       " + unidades[i]+ "       "+ precios[i]+"       "+precioTotal[i]);
        }

        System.out.println("======================");
        System.out.println("Costo total:"+ costoTotalTicket);


    }
}

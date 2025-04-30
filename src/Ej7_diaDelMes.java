import java.util.Scanner;

public class Ej7_diaDelMes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] nombresMeses={"Enero","Febrero","Marzo","Abril","Mayo",
                      "Junio","Julio","Agosto","Septiembre",
                      "Octubre","Noviembre","Diciembre"};


        int[] numDias={31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Ingrese número de mes");
        int numMes= sc.nextInt();

              if (numMes<1 || numMes>12){
                  System.out.println("Número de mes invalido");
              }
              else {
                  int dias=numDias[numMes - 1];
                  String nombreMes=nombresMeses[numMes - 1];
                  System.out.println("El mes de "+nombreMes+" tiene "+dias+" dias");
              }
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ej1_Notas {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Scanner dato= new Scanner (System.in);

        String[]nombres;

        nombres=new String[5];

        nombres[0]="Pedro";
        nombres[1]="Pablo";
        nombres[2]="Maria";
        nombres[3]="Marta";
        nombres[4]="Ivan";


        byte[]notas={10,9,8,7,6};

        System.out.println("Por favor,ingresa el nombre de la persona que desea buscar");
        String nombreBuscado=dato.next();


        for (byte i=0;i<nombres.length ;i++){
            if (nombres[i].equals(nombreBuscado)) {
                System.out.println("La nota de " + nombreBuscado + " es: " + notas[i]);
                break;
            }

        }

        }

}
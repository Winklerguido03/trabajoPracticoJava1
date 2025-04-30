import java.util.Scanner;

public class Ej8_promedioNotaMasAlta {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] notas=new int[5];

        for (int i=0;i<notas.length;i++){
            System.out.println("Ingrese nota de estudiante "+i);
            notas[i]= sc.nextInt();
        }

        int notaMasAlta=0;
        int suma=0;
        for (int i=0;i<notas.length;i++){

            suma+=notas[i];

            if (notas[i]>notaMasAlta){
                notaMasAlta=notas[i];
            }
        }

        double promedio=suma/notas.length;

        System.out.println("El promedio de notas es:"+promedio);
        System.out.println("La nota mas alta es:"+notaMasAlta);


    }
}

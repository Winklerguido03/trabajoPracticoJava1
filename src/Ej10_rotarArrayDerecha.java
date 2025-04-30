import java.util.Scanner;

public class Ej10_rotarArrayDerecha {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] array=new int[3];

        for (int i=0;i< array.length;i++){
            System.out.println("Ingrese número");
            array[i]= sc.nextInt();
        }

        System.out.println("Array antes de rotar:");
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

        rotarDerecha(array);

        System.out.println("Array después de rotar:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void rotarDerecha(int []array){
        int ultimo = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;

    }
}

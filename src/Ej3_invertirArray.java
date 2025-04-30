import java.util.Arrays;
import java.util.Scanner;

public class Ej3_invertirArray {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        System.out.println("Por favor,ingrese la cantidad de números");
        byte cant = dato.nextByte();

        byte[] nums;
        nums = new byte[cant];
        for (byte i = 0; i < nums.length; i++) {

            System.out.println("Ingrese un número");
            nums[i] = dato.nextByte();
        }

        String cadenaDeNumeros = "-";
        for (byte i = 0; i < nums.length; i++) {

            cadenaDeNumeros += nums[i] + "-";

        }

        System.out.println("Números ingresados:" + cadenaDeNumeros);

        String cadenaDeNumeros3 = "-";
        for (int i = nums.length - 1; i >= 0; i--) {
            cadenaDeNumeros3 += nums[i] + "-";

        }
        System.out.println("Números invertidos:" + cadenaDeNumeros3);

    }
}

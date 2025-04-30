import java.util.Scanner;

public class Ej2_letraTexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        String texto = sc.nextLine();

        System.out.println("Ingrese una letra");
        String letra = sc.next();
        char letraIngresada=letra.charAt(0);

        int cantidad=0;
        for (int i=0;i<texto.length();i++){

            char Caracter=texto.charAt(i);
            if (Caracter == letraIngresada){
                cantidad++;
            }
        }

        System.out.println("La letra "+letra+" se repite "+cantidad+" veces");


    }
}
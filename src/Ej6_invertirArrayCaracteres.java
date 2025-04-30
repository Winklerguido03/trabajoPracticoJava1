import java.util.Scanner;

public class Ej6_invertirArrayCaracteres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] caracteres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un caracter");
            caracteres[i] = sc.next();
        }

        String cadenaCaracteres="-";


        for (int i = 0; i < 5; i++) {

            cadenaCaracteres+=caracteres[i]+"-";

        }

        System.out.println("Los caracteres son:"+cadenaCaracteres);

        String cadenaCaracteres2="";
        for (int i = caracteres.length - 1; i >= 0; i--) {

            cadenaCaracteres2+=caracteres[i]+"-";

        }
        System.out.println("Los caracteres invertidos son:"+cadenaCaracteres2);
    }
}

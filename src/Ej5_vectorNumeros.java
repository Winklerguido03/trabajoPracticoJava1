public class Ej5_vectorNumeros {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.println("Número-Cuadrado-Cubo");
        for (int i = 0; i < vectorNumeros.length; i++) {
            int numero = vectorNumeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + " " + cuadrado + " " + cubo);
        }
    }
}


import java.util.Scanner;

public class Ej9_conversiónTemperaturas {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Seleccione tipo de conversión:");
        System.out.println("1.Celsius a Fahrenheit");
        System.out.println("2.Fahrenheit a Celsius");
        int op= sc.nextInt();


        if (op==1){
            System.out.println("Ingrese temperatura en grado Celsius");
            double celsius=sc.nextDouble();
            celsiusAFahrenheit(celsius);
        }
        else {
            System.out.println("Ingrese temperatura en grado Fahrenheit");
            double fahrenheit= sc.nextDouble();
            fahrenheitACelsius(fahrenheit);
        }
    }

    public static double celsiusAFahrenheit(double celsius){
        double temperatura=(celsius * 9/5) + 32;
        System.out.println("La temperatura en grado Fahrenheit es:"+temperatura);

        return temperatura;
    }

    public static double fahrenheitACelsius(double fahrenheit){
        double temperatura=(fahrenheit-32) * 5/9;
        System.out.println("La temperatura en grado Celsius es:"+temperatura);

        return temperatura;
    }
}

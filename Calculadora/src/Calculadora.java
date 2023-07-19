import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido a la calculadora básica:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + sumar(num1, num2));
                    case 2 -> System.out.println("Resultado: " + restar(num1, num2));
                    case 3 -> System.out.println("Resultado: " + multiplicar(num1, num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Resultado: " + dividir(num1, num2));
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                    }
                }
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

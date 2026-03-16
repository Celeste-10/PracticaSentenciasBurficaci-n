package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del paquete: ");
        double peso= scanner.nextDouble();

        System.out.println("Indique la distancia del envio: ");
        double distancia = scanner.nextDouble();

        System.out.print("¿El producto es frágil? (true/false): ");
        boolean fragil = scanner.nextBoolean();
        String metodo = decidirEnvio(peso, distancia, fragil);

        System.out.println("Método de envío seleccionado: " + metodo);

        scanner.close();

    }
    public static String decidirEnvio(double peso, double distancia, boolean fragil) {

        if (peso > 50 && distancia > 100) {
            return "Transporte pesado";
        }
        else if (peso < 50 && fragil) {
            return "Envío Premium";
        }
        else if (peso < 10 && distancia < 20) {
            return "Dron";
        }
        else {
            return "Envío estándar";
        }
    }

}

package Main;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de cliente (NORMAL, VIP, PLATINO, EMPRESA): ");
        String tipoCliente = scanner.nextLine().toUpperCase();

        double descuento;

        if (tipoCliente.equals("NORMAL")) {
            descuento = 0.05;
        } else if (tipoCliente.equals("VIP")) {
            descuento = 0.10;
        } else if (tipoCliente.equals("PLATINO")) {
            descuento = 0.15;
        } else if (tipoCliente.equals("EMPRESA")) {
            descuento = 0.20;
        } else {
            descuento = 0;
        }

        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");

        scanner.close();

    }
}

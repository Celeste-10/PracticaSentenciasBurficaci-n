package Main;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }

        if (password.length() < 8) {
            System.out.println("Contraseña Insegura");
        }
        else if (password.length() >= 8 && tieneNumero && tieneMayuscula) {
            System.out.println("Contraseña Fuerte");
        }
        else if (password.length() >= 8 && tieneNumero) {
            System.out.println("Contraseña Moderada");
        }
        else {
            System.out.println("Contraseña Insegura");
        }

        scanner.close();

    }
}

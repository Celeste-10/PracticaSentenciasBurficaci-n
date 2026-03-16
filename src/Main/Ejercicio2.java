package Main;

import java.util.Scanner;

public class Ejercicio2 {
    public class ValidadorFecha {

        public static boolean esBisiesto(int anio) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                return true;
            }
            return false;
        }

        public static boolean fechaValida(int dia, int mes, int anio) {

            if (mes < 1 || mes > 12) {
                return false;
            }

            int diasMes;

            switch (mes) {
                case 4: case 6: case 9: case 11:
                    diasMes = 30;
                    break;

                case 2:
                    if (esBisiesto(anio)) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;

                default:
                    diasMes = 31;
            }

            if (dia < 1 || dia > diasMes) {
                return false;
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el día: ");
            int dia = scanner.nextInt();

            System.out.print("Ingrese el mes: ");
            int mes = scanner.nextInt();

            System.out.print("Ingrese el año: ");
            int anio = scanner.nextInt();

            if (fechaValida(dia, mes, anio)) {
                System.out.println("La fecha es válida.");
            } else {
                System.out.println("La fecha NO es válida.");
            }

            scanner.close();
        }
    }
}

package TeatroMunicipal;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Vender boleto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Tipo de boleto (1-Palco, 2-Platea, 3-Galería): ");
                int tipo = sc.nextInt();
                System.out.print("Número de boleto: ");
                int numero = sc.nextInt();

                Boleto boleto = null;

                if (tipo == 1) {
                    boleto = new Palco(numero);
                } else {
                    System.out.print("Días de anticipación: ");
                    int dias = sc.nextInt();
                    if (tipo == 2) {
                        boleto = new Platea(numero, dias);
                    } else if (tipo == 3) {
                        boleto = new Galeria(numero, dias);
                    }
                }

                if (boleto != null) {
                    System.out.println("Información: " + boleto.obtenerInfo());
                }
            }
        } while (opcion != 2);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}


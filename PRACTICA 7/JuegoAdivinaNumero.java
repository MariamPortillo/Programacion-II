package Juego;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // número entre 0 y 10
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un número entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    System.out.println("¡Has perdido! El número era: " + numeroAAdivinar);
                    break;
                }

                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor. Intenta de nuevo:");
                } else {
                    System.out.println("El número es menor. Intenta de nuevo:");
                }
            }
        }
    }
}

package Juego;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("Nuevo récord: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas.");
        return numeroDeVidas > 0;
    }
}


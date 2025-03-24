package EcuacionCuadratica;

public class EcuacionCuadratica {
	private double a, b, c;
	public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
	private double getDiscriminante() {
		return ((b*b)-(4*a*c));
	}
	public boolean tieneRaicesReales() {
        return getDiscriminante() >= 0;
    }

    public Double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        }
        return null;
    }

    
    public Double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        }
        return null; 
    }

    public void calcularSoluciones() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            System.out.println("Soluciones: x1 = " + getRaiz1() + ", x2 = " + getRaiz2());
        } else if (discriminante == 0) {
            System.out.println("Única solución: x = " + getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }


}

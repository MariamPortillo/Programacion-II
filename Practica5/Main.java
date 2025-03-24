package EcuacionCuadratica;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        ecuacion.calcularSoluciones();

        scanner.close();

	}

}

public class FiguraGeometrica {
	double area(double radio) {
		return Math.PI*radio*radio;
	}
	double area(double base,double altura) {
		return base*altura;
	}
	double area(double base, float altura) {
		return(base*altura)/2;
	}
	double area(double base1, double base2,double altura) {
		return((base1*base2)*altura)/2;
	}
	public double area(int lado) {
        return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
    }
	
	public static void main(String[] args) {
		FiguraGeometrica f1= new FiguraGeometrica();
		FiguraGeometrica f2 = new FiguraGeometrica();
		FiguraGeometrica f3 = new FiguraGeometrica();
		FiguraGeometrica f4 = new FiguraGeometrica();
		FiguraGeometrica f5 = new FiguraGeometrica();
		System.out.println("Circulo:  "+f1.area(1));
		System.out.println("Rectangulo:  "+f2.area(2, 4));
		System.out.println("Triangulo Rectangulo: "+f3.area(5, 3));
		System.out.println("Trapecio: "+f4.area(3, 4, 6));
		System.out.println("Pentagono: "+f5.area(6));
	
	}
}
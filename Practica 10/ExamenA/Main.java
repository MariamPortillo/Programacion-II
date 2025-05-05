package ExamenA;

public class Main {
    public static void main(String[] args) {
        LineaTeleferico l1 = new LineaTeleferico("Roja", "Estación Central, Estación Cementerio");
        LineaTeleferico l2 = new LineaTeleferico();
        l2.nombre = "Verde";
        l2.direccion = "Irpavi, Alto Obrajes";

        
        l1.adicionarEmpleado("Pedro", "Lopez", "Rojas", 35, 2500);
        l1.adicionarEmpleado("Lucy", "Sosa", "Perez", 43, 3250);
        l1.adicionarEmpleado("Ana", "Arce", "Luna", 26, 2700);
        l1.adicionarEmpleado("Saul", "Rios", "Calle", 29, 2500);

        l2.adicionarEmpleado("Carlos", "Gutierrez", "Quispe", 26, 2400);
        l2.adicionarEmpleado("Maria", "Choque", "Llanos", 35, 2800);

        System.out.println(">> Empleados de la Línea Roja:");
        l1.mostrarEmpleados();

        System.out.println("\n>> Eliminando empleados con edad 43");
        l1.eliminarPorEdad(43);
        l1.mostrarEmpleados();

        System.out.println("\n>> Transferencia de empleado (índice 0) de Verde a Roja:");
        l1.transferirEmpleado(0, l2);
        l1.mostrarEmpleados();

        System.out.println("\n>> Empleado con menor edad:");
        l1.mostrarEmpleadoMenorEdad();

        System.out.println("\n>> Empleado con menor sueldo:");
        l1.mostrarEmpleadoMenorSueldo();
    }
}


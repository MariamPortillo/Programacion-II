package ExamenB;

public class Main{
 public static void main(String[] args) {
     // Instancia 1 (con constructor lleno)
     Ministerio m1 = new Ministerio("Ministerio de Obras Públicas", "La Paz");

     // Instancia 2 (con constructor vacío)
     Ministerio m2 = new Ministerio();
     m2.nombre = "Ministerio de Educación";
     m2.direccion = "Sucre";

     
     m1.adicionarEmpleado("Pedro", "Lopez", "Rojas", 35, 2500);
     m1.adicionarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
     m1.adicionarEmpleado("Ana", "Perez", "Rojas", 26, 2700);
     m1.adicionarEmpleado("Saul", "Arce", "Calle", 29, 2500);

     
     m2.adicionarEmpleado("Luis", "Mamani", "Quispe", 26, 2400);
     m2.adicionarEmpleado("Maria", "Choque", "Llanos", 35, 2800);

     System.out.println(">> Antes de eliminar:");
     m1.mostrarEmpleados();

     System.out.println("\n>> Eliminar empleados con edad 43:");
     m1.eliminarPorEdad(43);
     m1.mostrarEmpleados();

     System.out.println("\n>> Transferir un empleado de m2 a m1:");
     m1.transferirEmpleado(0, m2);
     m1.mostrarEmpleados();

     System.out.println("\n>> Empleado con menor edad:");
     m1.mostrarEmpleadoMenorEdad();

     System.out.println("\n>> Empleado con menor sueldo:");
     m1.mostrarEmpleadoMenorSueldo();
 }
}



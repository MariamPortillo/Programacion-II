package ExamenA;
public class LineaTeleferico {
    String nombre;
    String direccion;
    int nroEmpleados;
    String[][] empleados = new String[3][100];
    int[] edades = new int[100];
    double[] sueldos = new double[100];

    public LineaTeleferico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0;
    }

    public LineaTeleferico() {
        this.nombre = "";
        this.direccion = "";
        this.nroEmpleados = 0;
    }

    public void adicionarEmpleado(String nombre, String ap1, String ap2, int edad, double sueldo) {
        empleados[0][nroEmpleados] = nombre;
        empleados[1][nroEmpleados] = ap1;
        empleados[2][nroEmpleados] = ap2;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }

    public void eliminarPorEdad(int edadX) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == edadX) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[0][j] = empleados[0][j + 1];
                    empleados[1][j] = empleados[1][j + 1];
                    empleados[2][j] = empleados[2][j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--; 
            }
        }
    }

    public void transferirEmpleado(int index, LineaTeleferico otra) {
        if (index >= 0 && index < otra.nroEmpleados) {
            this.adicionarEmpleado(
                otra.empleados[0][index],
                otra.empleados[1][index],
                otra.empleados[2][index],
                otra.edades[index],
                otra.sueldos[index]
            );
            otra.eliminarEmpleado(index);
        }
    }

    private void eliminarEmpleado(int index) {
        for (int j = index; j < nroEmpleados - 1; j++) {
            empleados[0][j] = empleados[0][j + 1];
            empleados[1][j] = empleados[1][j + 1];
            empleados[2][j] = empleados[2][j + 1];
            edades[j] = edades[j + 1];
            sueldos[j] = sueldos[j + 1];
        }
        nroEmpleados--;
    }

    public void mostrarEmpleadoMenorEdad() {
        int menorEdad = Integer.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] < menorEdad) {
                menorEdad = edades[i];
            }
        }
        System.out.println("Empleado(s) con menor edad (" + menorEdad + "):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == menorEdad) {
                System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i]);
            }
        }
    }

    public void mostrarEmpleadoMenorSueldo() {
        double menorSueldo = Double.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] < menorSueldo) {
                menorSueldo = sueldos[i];
            }
        }
        System.out.println("Empleado(s) con menor sueldo (" + menorSueldo + "):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == menorSueldo) {
                System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i]);
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de la línea " + nombre + ":");
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i]
                + " | Edad: " + edades[i] + " | Sueldo: " + sueldos[i]);
        }
    }
}

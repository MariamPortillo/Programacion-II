class Ministerio:
    def __init__(self, nombre="", direccion=""):
        self.nombre = nombre
        self.direccion = direccion
        self.empleados = []  # Lista de tuplas: (nombre, edad, sueldo)

    def adicionar_empleado(self, nombre, edad, sueldo):
        self.empleados.append((nombre, edad, sueldo))

    def __add__(self, otro):
        """Sobrecarga del operador + para transferir el primer empleado del otro Ministerio."""
        if otro.empleados:
            empleado = otro.empleados.pop(0)
            self.empleados.append(empleado)
        return self

    def mostrar(self):
        print(f"Ministerio {self.nombre} ({self.direccion})")
        for e in self.empleados:
            print(f"{e[0]} | Edad: {e[1]} | Sueldo: {e[2]}")

# Ejemplo de uso:
m1 = Ministerio("Salud", "La Paz")
m2 = Ministerio("Educación", "Cochabamba")
m1.adicionar_empleado("Ana", 28, 3100)
m2.adicionar_empleado("Luis", 40, 2900)

print("Antes de la transferencia:")
m1.mostrar()
m2.mostrar()

m1 = m1 + m2  # Transferencia

print("\nDespués de la transferencia:")
m1.mostrar()
m2.mostrar()

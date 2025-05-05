class LineaTeleferico:
    def __init__(self, nombre="", direccion=""):
        self.nombre = nombre
        self.direccion = direccion
        self.empleados = []  # Lista de tuplas: (nombre, ap1, ap2, edad, sueldo)

    def adicionar_empleado(self, nombre, ap1, ap2, edad, sueldo):
        self.empleados.append((nombre, ap1, ap2, edad, sueldo))

    def __add__(self, otro):
        """Sobrecarga del operador + para transferir el primer empleado del otro objeto."""
        if otro.empleados:
            empleado = otro.empleados.pop(0)
            self.empleados.append(empleado)
        return self

    def mostrar(self):
        print(f"Linea {self.nombre} ({self.direccion})")
        for e in self.empleados:
            print(f"{e[0]} {e[1]} {e[2]} | Edad: {e[3]} | Sueldo: {e[4]}")

# Ejemplo de uso:
l1 = LineaTeleferico("Rojo", "Estación Central")
l2 = LineaTeleferico("Verde", "Irpavi")
l1.adicionar_empleado("Pedro", "Lopez", "Rojas", 35, 2500)
l2.adicionar_empleado("Carlos", "Gutierrez", "Quispe", 30, 2400)

print("Antes de la transferencia:")
l1.mostrar()
l2.mostrar()

l1 = l1 + l2  # Transferencia

print("\nDespués de la transferencia:")
l1.mostrar()
l2.mostrar()

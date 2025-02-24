import math
import matplotlib.pyplot as plt
class Punto:
    def __init__(self, x, y):
        self.x = x

        self.y = y
    def coord_cartesianas(self):
        return self.x, self.y
    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.atan2(self.y,self.y)
        angulo = math.degrees(angulo)
        return radio, angulo
    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1,p2):
        self.p1=p1
        self.p2=p2
    def __str__(self):
        return "Linea de {} a {}".format(self.p1,self.p2)
    def dibuja_linea(self):
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], marker='o', linestyle='-')
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Dibujo de Línea")
        plt.grid()
        plt.show()

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return "Círculo con centro en {} y radio {:.2f}".format(self.centro, self.radio)

    def dibuja_circulo(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, fill=False, edgecolor='blue')
        ax.add_patch(circulo)
        plt.xlim(self.centro.x - self.radio - 1, self.centro.x + self.radio + 1)
        plt.ylim(self.centro.y - self.radio - 1, self.centro.y + self.radio + 1)
        plt.gca().set_aspect('equal', adjustable='box')
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.title("Dibujo de Círculo")
        plt.grid()
        plt.show()
p1 = Punto(1, 2)
p2 = Punto(4, 6)
linea = Linea(p1, p2)
print(linea)
linea.dibuja_linea()

centro = Punto(3, 3)
circulo = Circulo(centro, 2)
print(circulo)
circulo.dibuja_circulo()
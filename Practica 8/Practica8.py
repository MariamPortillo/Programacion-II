
class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaXZ(self):
        self.x += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1



class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z  

    def incrementaYZ(self):
        self.y += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1


class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)  

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1  



def main():

    print("=== Clase D ===")
    obj_d = D(2, 20, 100)
    obj_d.incrementaXYZ()
    print(f"Incrementando : x = {obj_d.x}, y = {obj_d.y}, z = {obj_d.z}")


if __name__ == "__main__":
    main()

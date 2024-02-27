class Persona:
    def __init__(self,nombre,edad):
        self.nombre = nombre
        self.edad = edad
        
    def Mostrar_datos(self):
        print(f"El nombre de persona es: {self.nombre}")
        print(f"la edad de la persona es: {self.nombre}")

class Estudiante(Persona):
    def __init__(self,nombre,edad,curso):
        super().__init__(nombre,edad)
        self.curso = curso
    def Mostrar_grado(self):
        print(f"El estudiante esta en el grado:{self.curso}")
estudiante = Estudiante("Joel",21,"2do semestre")
estudiante.Mostrar_datos()
estudiante.Mostrar_grado()
    
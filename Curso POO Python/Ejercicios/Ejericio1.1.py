class Estudiante:
    #constructor en python de la clase estudiante
    def __init__ (self,nombre,edad,grado):
        self.nombre =nombre
        self.edad = edad
        self.grado = grado
        
Joel = Estudiante("Joel","21","2")

print(Joel.edad)       
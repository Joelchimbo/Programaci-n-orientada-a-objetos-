from abc import ABC, abstractmethod

class Persona(ABC):
    @abstractmethod
    def __init__(self, nombre, edad, sexo, actividad):
        self.nombre = nombre
        self.edad = edad
        self.sexo = sexo
        self.actividad = actividad
        
    @abstractmethod
    def hacer_actividad(self):
        pass
    
    def presentarse(self):
        print(f'Hola, me llamo: {self.nombre} y tengo {self.edad} años')

class Estudiante(Persona):
    def __init__(self, nombre, edad, sexo, actividad):
        super().__init__(nombre, edad, sexo, actividad)
        
    def hacer_actividad(self):
        print(f"Estoy estudiando: {self.actividad}")
    
class Trabajador(Persona):
    def __init__(self, nombre, edad, sexo, actividad):
        super().__init__(nombre, edad, sexo, actividad)
        
    def hacer_actividad(self):
        print(f"Actualmente estoy trabajando de : {self.actividad}")

# Crear instancias y llamar a los métodos
neicer = Trabajador("Neicer", 21, "Masculino", "Ingeniería")    
joel = Estudiante("Joel", 21, "Masculino", "Programador")

joel.presentarse()
joel.hacer_actividad()

neicer.presentarse()
neicer.hacer_actividad()

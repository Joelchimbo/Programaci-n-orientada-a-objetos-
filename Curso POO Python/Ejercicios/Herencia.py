class Persona:
    def __init__(self, nombre, edad, nacionalidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionalidad = nacionalidad
    #primer metodo 
    def hablar(self):
        print("Esta hablando")
        
#pongo en parentesis la clase que voy a heredar        
class Empleado(Persona):
    def __init__(self, nombre, edad, nacionalidad, trabajo, sueldo):
        super().__init__(nombre,edad,nacionalidad)
        self.trabajo = trabajo
        self.sueldo = sueldo
    #sobreescribo el metodo de la clase padre para agregar algo
    def hablar(self):
        print ("No esta hablando")

joel = Empleado("Joel", 21, "ecuatoriano", "Programador", 4500)
# Herencia simple...
joel.hablar()

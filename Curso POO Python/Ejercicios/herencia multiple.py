class Persona:
    def __init__(self, nombre, edad, nacionalidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionalidad = nacionalidad
    #primer metodo 
    def hablar(self):
        print("Esta hablando")
        
#Clase nueva Artista       
class Artista(Persona):
    def __init__(self,nombre,edad,nacionalidad,habilidad):
        super().__init__(nombre,edad,nacionalidad)
        self.habilidad = habilidad
        
    def mostrar_habilidad (self):
        print(f"Mi habilidad es : {self.habilidad}")

#Nueva Clase EmpleadoArtista
class EmpleadoArtista(Artista,Persona):
    def __init__(self, nombre, edad, nacionalidad, habilidad,sueldo,empresa):
        Persona.__init__(self,nombre,edad,nacionalidad)
        Artista.__init__(self,nombre,edad,nacionalidad,habilidad)
        self.sueldo = sueldo
        self.empresa =empresa
    def mostrar_habilidad(self):
        print("no tengo xd")
    def presentarse(self):
        return f'{self.mostrar_habilidad()}'
    
    
joel =EmpleadoArtista ("Joel", 21, "ecuatoriano","Jugarfutbol", "Programador", 4500,)
# Herencia Multiple
joel.presentarse()
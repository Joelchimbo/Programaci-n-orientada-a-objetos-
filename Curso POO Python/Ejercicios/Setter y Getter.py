class Persona:
    def __init__(self,nombre,edad):
        self.nombre=nombre
        self.edad = edad
    # de esta forma accedo al nombre ... funcion que accede a un valor que es privvado de una clase   
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self,new_nombre):
        self.__nombre = new_nombre
        
        
Joel = Persona("Joel",21)

nombre = Joel.get_nombre()
print(f'mi nombre es {nombre}')


Joel.set_nombre("Neicer")


nombre = Joel.get_nombre
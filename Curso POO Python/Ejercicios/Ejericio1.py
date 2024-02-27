class Estudiante:
    #constructor en python de la clase estudiante
    def __init__ (self, nombre, edad, grado):
        self.nombre = nombre
        self.edad = edad
        self.grado = grado
        #metodo estudiar
    def estudiar(self):
        print("Se ha puesto a estudiar")
        
#ingreso de datos por el usuario
nombre = input ("Ingrese su nombre: ")
edad = input ("Su edad: ")
grado = input ("Su Semestre:  ")

#crea la instacia de la clase estudiante
estudiante = Estudiante(nombre, edad, grado)

print(f"""
              DATOS DEL ESTUDIANTE  \n\n
              Nombre: {estudiante.nombre}\n
              Edad: {estudiante.edad}\n
              Grado: {estudiante.grado}\n
              """)
while True:
    estudiar = input()
    if (estudiar.lower()=="estudiar"):
         estudiante.estudiar()


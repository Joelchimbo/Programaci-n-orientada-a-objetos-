#Decoradres
def decorador(funcion):
    def funcion_modificada():
        print("Antes de llamar a la funcion")
        funcion()
    return funcion_modificada

#def saludo():

# print("Hola Joel, Como estas")

#saludo:modificado = decorador(saludo)
#saludo_modificado()

@decorador

def saludo():
    print("Hola Joel, como estas?")
    
saludo()

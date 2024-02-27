class Celular:
    #constructor en Python para crear atributos de instacia
        def __init__(self, marca, modelo, camara):
            self.marca = marca
            self.modelo = modelo
            self.camara = camara
    #Metodos dentro de una clase
        def llamar(self):
            # f en el print para agregar un texto,propiedad o caracteristica de la clase...
            print( f'Estas haciendouna llamada desde:{self.modelo}')
        def Colgar(self):
            print(f'colgo la llamada desde su:{self.modelo}')   
celular1 = Celular("Apple", "iPhone 11 Pro", "12MP")
celular2 = Celular("Samsung", "S24 Ultra", "24MP")


celular2.Colgar()
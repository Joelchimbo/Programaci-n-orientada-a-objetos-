#clase padre animal
class Animal:
    def comer(self):
        print("El animal se esta alimentando")
#clase hija Ave, hereda de la clase animal
class Ave(Animal):
    def volar(self):
        print("El animal esta volando")
#clase hija mamifero, hereda de la clase animal       
class Mamifero(Animal):
    def amamantar(self):
        print("El animal esta amamantando")
#clase Murcielago, hereda de la clase Mamifero y Ave        
class Murcielago(Mamifero,Ave):
    pass

#se crea la instancia y se aplican los metodos
murcielago = Murcielago()
murcielago.comer()
murcielago.volar()
murcielago.amamantar()

#polimorfismo de herencia
class Gato():
    def sonido(self):
        return "Miauu"
    
class Perro():
    def sonido(self):
        return "Guau"
def hacer_sonido(animal):
    print(animal.sonido()
          )
gato = Gato()
perro =Perro()

hacer_sonido(perro)

print(gato.sonido())
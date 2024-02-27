#Encapsulamiento
class MiClase:
    
#Atributo Privado
    def _init_(self):
        self._atributo_privado ="valor"
        
        
objeto = MiClase()
print(objeto._atributo_privado)

#Atributo muy privado
def __init__(self):
        self._atributo_privado ="valor"
        
        
objeto = MiClase()
print(objeto._atributo_privado)

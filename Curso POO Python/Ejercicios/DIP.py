class Diccionario:
    def verificar_palabra(self,palabra):
       pass
class CorrectorOrtográfico:
    def __init__(self):
        self.diccionario =Diccionario()
        
    def corregir_texto(self, texto):
        pass

from abc import ABC, abstractmethod

class VerificadorOrtografico(ABC):
    @abstractmethod
    def verificar_palabra(self,palabra):
        pass
    
class Diccionario(VerificadorOrtografico):
    def verificar_palabra(self, palabra):
        pass
    
class CorrectorOrtográfico:
    def __init__(self, verificador):
        self.verificador = verificador
        
    def corregir_texto(self,texto):
        
corrector = CorrectorOrtográfico(Diccionario())

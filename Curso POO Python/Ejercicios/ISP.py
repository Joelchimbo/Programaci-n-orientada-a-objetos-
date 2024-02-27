from abc import ABC, abstractmethod

class Trabajador(ABC):
    @abstractmethod
    def trabajar(self):
        pass
class Comedor(ABC):
    @abstractmethod
    def comer(self):
        pass
class Durmiente(ABC):
    @abstractmethod
    def dormir(self):
        pass
    
    
    
class Humano(Trabajador,Durmiente,Comedor):
    def comer(self):
        print("El humano está comiendo")
        
    def trabajar(self):
        print("El humano está trabajando")
        
    def dormir(self):
        print("El humano está durmiendo")
        
        
class Robot(Trabajador):        
    def trabajar(self):
        print("El Robot está trabajando")
        
     


robot = Robot()
humano = Humano()

   
humano.trabajar()
robot.trabajar()
humano.comer()
robot.dormir()
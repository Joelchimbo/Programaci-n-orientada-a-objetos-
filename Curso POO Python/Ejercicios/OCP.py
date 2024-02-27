class Notificador:
    def __init__ (self, usuario, mensajes):
        self.usuario = usuario
        self.mensajes = mensajes
        
    def Notificador(self):
        raise NotImplementedError
    
    
class NotificadorEmail(Notificador):
    def Notificar(self):
        print(f"Envidando mensaje por EMAIL a{self.usuario.EMAIL}") 
        
class NotificadorWhatsapp(Notificador):
    def Notificar(self):
        print(f"Envidando mensaje por Whatsapp a{self.usuario.Whatsapp}") 
        
class NotificadorSMS(Notificador):
    def Notificar(self):
        print(f"Envidando mensaje por SMS a{self.usuario.SMS}") 
        
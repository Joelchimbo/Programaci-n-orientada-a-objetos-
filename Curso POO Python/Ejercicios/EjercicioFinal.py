import openai

openai.api_base = "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"
system_rol = '''Haz de cuanta que eres un analizador de sentimientos.
                 Yo te paso sentimientos y tu anlizas el sentimiento de los mensajes
                 y me das una repuesta con al menos 1 caracter y como maximo 4 caracteres 
                 SOLO RESPUESTAS NUMERICAS. donde -1 es negatividas maxima, 0 es neutral y 1 es positividad maxima.
                 Puedes ir entre estos rangos, es decir 0.3, -0.5 etc también son válidos.
                 (Puedes responder solo con ints o floats)'''

mensajes = [{"role": "sytem", "content": system_rol}]

class Sentimiento:
    def __init__(self, nombre,color):
        self.nombre = nombre 
        self.color = color


class AnalizadorDeSentiemientos:
    def analizar_sentimiento(self, polaridad):
        if polaridad > -0.8 and polaridad <= -0.3:
            return "\1b[1;31m" + "Negativo"+ "\x1b[0;37m"
        elif polaridad > -0.3 and polaridad < -0.1:
            return "\1b[1;31m" + "Algo Negativo"
        elif polaridad >= -0.1 and polaridad <= 0.1:
            return "\1b[1;33m" + "Neutral"+ "\x1b[0;37m"
        elif polaridad >= 0.1 and polaridad <= 0.4:
            return "\1b[1;32m" + "Algo Positivo"+ "\x1b[0;37m"
        elif polaridad >= 0.4 and polaridad <= 0.9:
            return "\1b[1;32m" + "positivo" + "\x1b[0;37m"
        elif polaridad > 0.9:
            return "\1b[1;32m" + "muy positivo" + "\x1b[0;37m"
        else:
            return "\x1b[1;31m" + "muy negativo" + "\x1b[0;37m"
        
analizador = AnalizadorDeSentiemientos()

while True:
    user_prompt = input("1x1b[1;33m" + "\nDime Algo: " + "\x1b[0;37m")
    mensajes.append({"role": "user", "content": user_prompt})

    completion = openai.ChatCompletion.create(
        model = "gpt-3.5-turbo",
        messages = mensajes,
        max_tokens = 8
    )

    respuesta = completion.choices[0].messages["content"]
    mensajes.append({"role": "assistant", "content": respuesta })

    sentimiento = analizador.analizar_sentimiento(float(respuesta))
    print(sentimiento)    
        
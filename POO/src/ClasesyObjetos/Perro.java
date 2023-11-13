
package ClasesyObjetos;

public class Perro {
    String nombre;
    String color;
    int edad;
    
    public static void main(String []args){
        Perro perro1 = new Perro();
        
        perro1.nombre = "JACK";
        perro1.color = "Negro";
        perro1.edad = 4;
        
        
        System.out.println("El nombre del perro1 es: "+perro1.nombre);
        System.out.println("El color del perro1 es: "+perro1.color);
        System.out.println("El edad del perro1 es: "+perro1.edad);
    }
    
}



package ClasesyObjetos;

public class Gato {
    String nombre;
    String color;
    int edad;
    
    public static void main(String []args){
        Gato gato1 = new Gato();
        
        gato1.nombre = "Michi";
        gato1.color = "Blanco";
        gato1.edad = 2;
        
        
        System.out.println("El nombre del gato1 es: "+gato1.nombre);
        System.out.println("El color del gato1 es: "+gato1.color);
        System.out.println("El edad del gato1 es: "+gato1.edad);
    }
    
}


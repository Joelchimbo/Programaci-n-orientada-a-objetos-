
package perro;

public class Perro {
    //Atributos
    String nombre;
    String color;
    int edad;
    


public Perro(String nombre,String color, int edad){
     this.nombre =nombre;
     this.color =color;
     this.edad =edad; 

}

public void correr(){
    System.out.println(this.nombre+" Empezo a correr");

}
public void ladrar(){
    System.out.println(this.nombre+" Empezo a ladrar");

}
public void morder(){
    System.out.println(this.nombre+" Empezo a morder");

}
public static void main(String[] args){
    Perro perro1 = new Perro("MAX","cafe",4);
    perro1.correr();
    perro1.ladrar();
    perro1.morder();
    
    
            


}

}

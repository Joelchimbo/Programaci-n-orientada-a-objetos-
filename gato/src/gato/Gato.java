
package gato;

public class Gato {
    String nombre;
    String color;
    int edad;
    
    public Gato(String nombre, String color,int edad){
        this.nombre=nombre;
        this.color=color;
        this.edad=edad;
    }
    
    public void lamer(){
        System.out.println(this.nombre+" Empezo a lamer");
    }
    public void ronronear(){
        System.out.println(this.nombre+" Empezo a ronoronear");
    }
    public static void main(String[] args) {
        Gato gato1= new Gato("MISI","bllanco",2);
        gato1.lamer();
        gato1.ronronear();
    }
    
}

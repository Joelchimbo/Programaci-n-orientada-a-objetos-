
package persona;

public class Persona {
    private String nombre;
    private double id;
    int edad;
    String sobrenombre;
    
    public Persona(String nombre,double id, int edad, String sobrenombre){
        this.nombre=nombre;
        this.id=id;
        this.edad=edad;
        this.sobrenombre=sobrenombre;
    }
    public void hablar(){
        System.out.println(this.nombre+" empezo a hablar");
    }
        public void saludar(){
        System.out.println(this.nombre+" empezo a saludar");
    }
            public void jugar(){
        System.out.println(this.nombre+" empezo a jugar");
    }
    public static void main(String[] args){
        Persona persona1=new Persona("JOEL",1753424363,21,"OSO");
        persona1.hablar();
        persona1.saludar();
        persona1.jugar();
    }
}

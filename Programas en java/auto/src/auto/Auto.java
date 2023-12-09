
package auto;

public class Auto {
    String marca;
    int velocidad;
    String color;
    String placa;
    

    public Auto(String marca, int velocidad,String color,String placa) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.color=color;
        this.placa = placa;
       
    }

    public void verificarVelocidad() {
        if (velocidad > 50) {
            System.out.println("Multa al auto " + marca + " de color " + color + " de placas: " + placa + " ,por exceso de velocidad");
        } else {
            System.out.println("Su auto " + marca + " de color " + color + " circula dentro de la velocidad permitida");
        }
    }

    public static void main(String[] args) {
        Auto BMW1 = new Auto("BMW", 25,"NEGRO","PCC-2002");
        BMW1.verificarVelocidad();
    }
}
    


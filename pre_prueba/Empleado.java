package pre_prueba;

public class Empleado {
    String nombre;
    String apellido;
    int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getsalario() {
        return salario;
    }

    public double bono() {
        double bono = (getsalario() * 10) / 100;
        return bono;
    }

    public void mostrar_información() {
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("El apellido es: " + this.apellido);
        System.out.println("La edad es: " + this.edad);
        System.out.println("El salario es: " + salario);
    }
}
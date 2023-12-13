package pre_prueba;
public class Gerente extends Empleado {
    public String departamento;

    public Gerente(String nombre, String apellido, int edad, double salario, String departamento) {
        super(nombre, apellido, edad);
        this.departamento = departamento;
    }
}
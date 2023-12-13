package pre_prueba;

    public class Desarrollador extends Empleado {
        public String lenguaje_programacion;
    
        public Desarrollador(String nombre, String apellido, int edad, double salario, String lenguaje_programacion) {
            super(nombre, apellido, edad);
            this.lenguaje_programacion = lenguaje_programacion;
        }
    }


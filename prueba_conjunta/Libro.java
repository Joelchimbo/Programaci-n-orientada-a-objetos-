package prueba_conjunta;

public class Libro {
    String titulo;
    String autor;
    protected int anio_publicacion;

    public Libro (String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    }

    public void setanio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public double getanio_() {
        return anio_publicacion;
    }

    public void mostrar_información(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de Publicación: " + this.anio_publicacion);
        }

    public void calcular_edad(){
        int actual=2023;
        int edad=(actual-this.anio_publicacion);
        System.out.println("La obra fue publicada "+edad+" años atrás.");
    }
 }
    


package prueba_conjunta;

public class LibroFiccion extends Libro{

    public String genero;
    public LibroFiccion(String titulo, String autor, double anio_publicacion, String genero) {
        super(titulo,autor);
        this.genero=genero;
    }
}
    


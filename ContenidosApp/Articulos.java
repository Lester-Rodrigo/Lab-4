package ContenidosApp;

public class Articulos extends Contenido implements ContenidoInterfase{

    public Articulos(String titulo, String autores, String etiqueta, String Informacion, int id) {
        super(titulo, autores, etiqueta, Informacion, "Articulos", id);
    }

    @Override
    public String publicarConetnido() {
        return ("Este artículo fue escrito por " + this.Autores + "\n" + " Introducción: " + this.Informacion);
    }
}

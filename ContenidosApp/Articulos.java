package ContenidosApp;

public class Articulos extends Contenido implements ContenidoInterfase{

    public Articulos(String titulo, String autores, String etiqueta, String Informacion) {
        super(titulo, autores, etiqueta, Informacion, "Articulos");
    }

    @Override
    public String publicarConetnido() {
        return ("Este artículo fue escrito por " + this.Autores + "\n" + " Introducción: " + this.Informacion);
    }
}

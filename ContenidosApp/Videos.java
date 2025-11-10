package ContenidosApp;

public class Videos extends Contenido implements ContenidoInterfase{

    public Videos(String titulo, String autores, String etiqueta, String Informacion, int id) {
        super(titulo, autores, etiqueta, Informacion, "Videos", id);
    }

    @Override
    public String publicarConetnido() {
        return ("Video de " + this.Autores + "\n" + " URL " + this.Informacion);
    }
}

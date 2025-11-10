package ContenidosApp;

public class Imagenes extends Contenido implements ContenidoInterfase{

    
    
    public Imagenes(String titulo, String autores, String etiqueta, String Informacion, int id) {
        super(titulo, autores, etiqueta, Informacion, "Imagen", id);
    }

    @Override
    public String publicarConetnido() {
        return ("Este es el bianrio de la foto de nombre " + this.Titulo + " por " + this.Autores + "\n" + this.Informacion);
    }
}

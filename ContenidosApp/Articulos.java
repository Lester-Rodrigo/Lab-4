package ContenidosApp;

public class Articulos implements Contenido{

    private String Titulo;
    private String Autores;
    private String Etiqueta;
    private String Tipo;
    private String Introduccion;

    public Articulos(String titulo, String autores, String etiqueta, String Introduccion) {
        this.Titulo = titulo;
        this.Autores = autores;
        this.Etiqueta = etiqueta;
        this.Introduccion = Introduccion;
        this.Tipo = "Articulos";
    }

    @Override
    public String publicarConetnido() {
        return ("Este artículo fue escrito por " + this.Autores + "\n" + " Introducción: " + this.Introduccion);
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        Etiqueta = etiqueta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getIntroduccion() {
        return Introduccion;
    }

    public void setIntroduccion(String introduccion) {
        Introduccion = introduccion;
    }
}

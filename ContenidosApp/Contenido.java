package ContenidosApp;

public class Contenido {

    protected String Titulo;
    protected String Autores;
    protected String Etiqueta;
    protected String Tipo;
    protected String Informacion;
    protected int id;

    public Contenido(String titulo, String autores, String etiqueta, String Informacion, String Tipo, int id) {
        this.Titulo = titulo;
        this.Autores = autores;
        this.Etiqueta = etiqueta;
        this.Informacion = Informacion;
        this.Tipo = Tipo;
        this.id = id;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        this.Autores = autores;
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.Etiqueta = etiqueta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getInformacion() {
        return Informacion;
    }

    public void setInformacion(String Informacion) {
        this.Informacion = Informacion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
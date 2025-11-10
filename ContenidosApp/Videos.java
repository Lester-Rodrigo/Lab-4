package ContenidosApp;

public class Videos implements Contenido{

    private String Titulo;
    private String URL;
    private String Etiqueta;
    private String Tipo;
    private String Autores;

    public Videos(String titulo, String URL, String etiqueta, String Autores) {
        this.Titulo = titulo;
        this.URL = URL;
        this.Etiqueta = etiqueta;
        this.Autores = Autores;
        this.Tipo = "Videos";
    }

    @Override
    public String publicarConetnido() {
        return ("Video de " + this.Autores + "\n" + " URL " + this.URL);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
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

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String autores) {
        Autores = autores;
    }
}

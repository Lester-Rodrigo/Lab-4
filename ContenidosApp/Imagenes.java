package ContenidosApp;

public class Imagenes implements Contenido{

    private String Titulo;
    private String Binario;
    private String Autores;
    private String Etiqueta;
    private String Tipo;

    public Imagenes (String Titulo, String Binario, String Etiqueta, String Autores) {
        this.Titulo = Titulo;
        this.Binario = Binario;
        this.Etiqueta = Etiqueta;
        this.Autores = Autores;
        this.Tipo = "Imagen";
    }
    
    @Override
    public String publicarConetnido() {
        return ("Este es el bianrio de la foto de nombre " + this.Titulo + " por " + this.Autores + "\n" + this.Binario);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getBinario() {
        return Binario;
    }

    public void setBinario(String binario) {
        Binario = binario;
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

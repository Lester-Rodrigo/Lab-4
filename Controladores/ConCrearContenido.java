package Controladores;

import java.util.ArrayList;

import ContenidosApp.Articulos;
import ContenidosApp.Contenido;
import ContenidosApp.Imagenes;
import ContenidosApp.Videos;

public class ConCrearContenido {

    private ArrayList<Contenido> Contenidos = new ArrayList<>();

    Imagenes nuevaImagenes = new Imagenes("Hermoso amanecer", 
    "01001001 01101101 01100001 01100111 01100101 01101110 ", "Naturaleza", "Desconocido", 1);
    Videos nuevoVideos = new Videos("Video musical", 
    "Rick Astley", "Música", "https://youtu.be/xvFZjo5PgG0?si=h6-un2lx2XHliXzr", 1);
    
    public ConCrearContenido () {
        Contenidos.add(nuevaImagenes);
        Contenidos.add(nuevoVideos);
    }

    public void CrearContenido (String Titulo, String Informacion, String Etiqueta, String Autores, int contenido, int id) {
        switch (contenido) {
            case 1:
                Imagenes imagenes = new Imagenes(Titulo, Informacion, Etiqueta, Autores, id);
                Contenidos.add(imagenes);
                break;
        
            case 2:
                Articulos articulos = new Articulos(Titulo, Autores, Etiqueta, Informacion, id);
                Contenidos.add(articulos);
                break;

            case 3:
                Videos videos = new Videos(Titulo, Informacion, Etiqueta, Autores, id);
                Contenidos.add(videos);
                break;
        }

    }

    public ArrayList<Contenido> getContenidos() {
        return Contenidos;
    }

}

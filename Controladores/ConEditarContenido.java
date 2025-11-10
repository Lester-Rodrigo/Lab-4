package Controladores;

import java.util.ArrayList;
import ContenidosApp.Contenido;

public class ConEditarContenido {

    private String Titulo;
    private String Informacion;
    private String Etiqueta;
    private String Autores;

    public ConEditarContenido () {
    }

    public void EditarContenidos (ArrayList<Contenido> contenidosCreados) {
        System.out.println("------Contenidos creados------");
        for (Contenido contenido : contenidosCreados) {
            System.out.println("Tipo: " + contenido.getTipo() + " Titulo: " 
            + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+ contenido.getEtiqueta() + "\n");
        }
        System.out.println("1. Editar segun tipo de contenido");
        System.out.println("2. Editar segun la etiqueta contenido");
        System.out.println("Seleccione una opción del 1 al 2: ");
    }
}

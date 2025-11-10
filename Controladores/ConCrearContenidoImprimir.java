package Controladores;

import java.util.Scanner;

public class ConCrearContenidoImprimir {

    Scanner input = new Scanner(System.in);

    ConCrearContenido conCrearContenido = new ConCrearContenido();

    private String Titulo;
    private String Informacion;
    private String Etiqueta;
    private String Autores;
    private int ContenidoCrear;
    private int tipoEtiqueta;
    private int IdImagenes = 1;
    private int IdVideos = 1;
    private int IdArtículos = 1;
    
    public ConCrearContenidoImprimir () {
    }

    public String IngresarNuevoContenido () {
        System.out.println("-------Crear nuevo contenidos:-------");
        System.out.println("1: Imágenes");
        System.out.println("2: Artículos");
        System.out.println("3: Videos");
        ContenidoCrear = input.nextInt();
        switch (ContenidoCrear) {
            case 1:
                input.nextLine();
                System.out.println("-------Ingrese la información de la imágen:------- ");
                System.out.println("1: Ingrese el titulo");
                Titulo = input.nextLine();
                System.out.println("Ingrese el binario de la imagen: ");
                Informacion = input.nextLine();
                System.out.println("Ingrese la etiqueta de la imágen: ");
                System.out.println("1: Música");
                System.out.println("2: Naturaleza");
                System.out.println("3: Tecnología");
                tipoEtiqueta = input.nextInt();
                switch (tipoEtiqueta) {
                    case 1:
                        Etiqueta = "Música";
                        break;
                
                    case 2:
                         Etiqueta = "Naturaleza";
                        break;

                    case 3:
                         Etiqueta = "Tecnología";
                        break;
                }
                input.nextLine();
                System.out.println("Ingrese los autores de la imágen (de no haber coloque Desconocidos): ");
                Autores = input.nextLine();
                IdImagenes = IdImagenes +1;
                conCrearContenido.CrearContenido(Titulo, Informacion, Etiqueta, Autores, ContenidoCrear, IdImagenes);
                break;
        
            case 2:
                input.nextLine();
                System.out.println("-------Ingrese la información del artículo:------- ");
                System.out.println("1: Ingrese el titulo");
                Titulo = input.nextLine();
                System.out.println("Ingrese la introducción del artículo: ");
                Informacion = input.nextLine();
                System.out.println("Ingrese la etiqueta del artículo: ");
                System.out.println("1: Música");
                System.out.println("2: Naturaleza");
                System.out.println("3: Tecnología");
                tipoEtiqueta = input.nextInt();
                switch (tipoEtiqueta) {
                    case 1:
                        Etiqueta = "Música";
                        break;
                
                    case 2:
                         Etiqueta = "Naturaleza";
                        break;

                    case 3:
                         Etiqueta = "Tecnología";
                        break;
                }
                input.nextLine();
                System.out.println("Ingrese los autores del artículo (de no haber coloque Desconocidos): ");
                Autores = input.nextLine();
                IdArtículos = IdArtículos +1;
                conCrearContenido.CrearContenido(Titulo, Informacion, Etiqueta, Autores, ContenidoCrear, IdArtículos);
                break;

            case 3:
                input.nextLine();
                System.out.println("-------Ingrese la información dle video:------- ");
                System.out.println("1: Ingrese el titulo");
                Titulo = input.nextLine();
                System.out.println("Ingrese la URL: ");
                Informacion = input.nextLine();
                System.out.println("Ingrese la etiqueta del video: ");
                System.out.println("1: Música");
                System.out.println("2: Naturaleza");
                System.out.println("3: Tecnología");
                tipoEtiqueta = input.nextInt();
                switch (tipoEtiqueta) {
                    case 1:
                        Etiqueta = "Música";
                        break;
                
                    case 2:
                         Etiqueta = "Naturaleza";
                        break;

                    case 3:
                         Etiqueta = "Tecnología";
                        break;
                }
                input.nextLine();
                System.out.println("Ingrese los autores del video (de no haber coloque Desconocidos): ");
                Autores = input.nextLine();
                IdVideos = IdVideos + 1;
                conCrearContenido.CrearContenido(Titulo, Informacion, Etiqueta, Autores, ContenidoCrear, IdVideos);
                break;
        }
        return "Contenido creado con éxito";
    }

    public ConCrearContenido getConCrearContenido() {
        return conCrearContenido;
    }
}

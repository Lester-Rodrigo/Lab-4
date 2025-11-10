package Controladores;

import java.util.ArrayList;
import java.util.Scanner;

import ContenidosApp.Articulos;
import ContenidosApp.Contenido;
import ContenidosApp.Imagenes;
import ContenidosApp.Videos;

public class ConEditarContenido {

    Scanner input = new Scanner(System.in);
    private int ContenidoEditar;
    private int tipoContenido;
    private String Titulo;
    private String Tipo;
    private String Informacion;
    private String Etiqueta;
    private String Autores;
    private int id;

    public ConEditarContenido () {
    }

    public void EditarContenidos (ArrayList<Contenido> contenidosCreados) {
        do {
            System.out.println("------Contenidos creados------");
            for (Contenido contenido : contenidosCreados) {
                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+ contenido.getEtiqueta() + "\n");
            }
            System.out.println("----------------------------------------------");
            System.out.println("1. Filtrar segun tipo de contenido");
            System.out.println("2. Filtrar segun la etiqueta contenido");
            System.out.println("3. Editar contenido");
            System.out.println("Seleccione una opción del 1 al 3: ");
            ContenidoEditar = input.nextInt();
        switch (ContenidoEditar) {
            case 1:
                System.out.println("Ingrese el tipo de contenido");
                System.out.println("1: Imágenes");
                System.out.println("2: Artículos");
                System.out.println("3: Videos");
                tipoContenido = input.nextInt();
                switch (tipoContenido) {
                    case 1:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals("Imágenes")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
                
                    case 2:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals("Artículos")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
        
                    case 3:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals("Videos")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
                }
                break;
        
            case 2:
                System.out.println("Ingrese la etiqueta del artículo: ");
                System.out.println("1: Música");
                System.out.println("2: Naturaleza");
                System.out.println("3: Tecnología");
                tipoContenido = input.nextInt();
                switch (tipoContenido) {
                    case 1:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getEtiqueta().equals("Música")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
                
                    case 2:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getEtiqueta().equals("Naturaleza")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
        
                    case 3:
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getEtiqueta().equals("Tecnología")) {
                                System.out.println("ID: "+ contenido.getId() +" Tipo: " + contenido.getTipo() + " Titulo: " 
                                + contenido.getTitulo() + " Autores: " + contenido.getAutores() + " Etiqueta: "+
                                    contenido.getEtiqueta() + "\n");
                            }
                        }
                         try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                        break;
                }
    
                break;

            case 3:
                System.out.println("Ingrese el tipo de contenido");
                System.out.println("1: Imágenes");
                System.out.println("2: Artículos");
                System.out.println("3: Videos");
                tipoContenido = input.nextInt();
                System.out.println("Ingrese el id de contenido");
                id = input.nextInt();
                input.nextLine();
                switch (tipoContenido) {
                    case 1:
                    Tipo = "Imágenes";
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals(Tipo) && contenido.getId() == id) {
                                System.out.println("-------Ingrese la información de la imágen:------- ");
                                System.out.println("1: Ingrese el titulo");
                                Titulo = input.nextLine();
                                System.out.println("Ingrese el binario de la imagen: ");
                                Informacion = input.nextLine();
                                System.out.println("Ingrese los autores de la imágen (de no haber coloque Desconocidos): ");
                                Autores = input.nextLine();
                                Etiqueta = contenido.getEtiqueta();
                                Imagenes imagenes = new Imagenes(Titulo, Autores, Etiqueta, Informacion, id);
                                contenidosCreados.add(imagenes);
                                contenidosCreados.remove(contenido);
                                System.out.println("Contenido editado con éxito");
                            }
                        }
                        break;
                
                    case 2:
                    Tipo = "Artículos";
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals(Tipo) && contenido.getId() == id) {
                                System.out.println("-------Ingrese la información del artículo:------- ");
                                System.out.println("1: Ingrese el titulo");
                                Titulo = input.nextLine();
                                System.out.println("Ingrese la introducción del artículo: ");
                                Informacion = input.nextLine();
                                System.out.println("Ingrese los autores del artículo (de no haber coloque Desconocidos): ");
                                Autores = input.nextLine();
                                Etiqueta = contenido.getEtiqueta();
                                Articulos articulos = new Articulos(Titulo, Autores, Etiqueta, Informacion, id);
                                contenidosCreados.add(articulos);
                                contenidosCreados.remove(contenido);
                                System.out.println("Contenido editado con éxito");
                            }
                        }
                
                        break;
        
                    case 3:
                    Tipo = "Videos";
                        for (Contenido contenido : contenidosCreados) {
                            if (contenido.getTipo().equals(Tipo) && contenido.getId() == id) {
                                System.out.println("-------Ingrese la información del video:------- ");
                                System.out.println("1: Ingrese el titulo");
                                Titulo = input.nextLine();
                                System.out.println("Ingrese la URL: ");
                                Informacion = input.nextLine();
                                System.out.println("Ingrese los autores del video (de no haber coloque Desconocidos): ");
                                Autores = input.nextLine();
                                Etiqueta = contenido.getEtiqueta();
                                Videos videos = new Videos (Titulo, Autores, Etiqueta, Informacion, id);
                                contenidosCreados.add(videos);
                                contenidosCreados.remove(contenido);
                                System.out.println("Contenido editado con éxito");
                            }
                        }
                        
                        break;
                }
                break;
        }
        } while (ContenidoEditar != 3);
    }
}

import java.util.Scanner;

import Controladores.ConCrearContenidoImprimir;
import Controladores.ConEditarContenido;
import Controladores.ConElimiarContenido;
import Controladores.ConPublicarContenido;
import Controladores.ConSeguridad;

public class Main {
    
    public static void main(String[] args) {

        ConSeguridad conSeguridad = new ConSeguridad();
        ConCrearContenidoImprimir conCrearContenidoImprimir = new ConCrearContenidoImprimir();
        ConEditarContenido conEditarContenido = new ConEditarContenido();
        ConElimiarContenido conElimiarContenido = new ConElimiarContenido();
        ConPublicarContenido conPublicarContenido = new ConPublicarContenido();
        Scanner input = new Scanner(System.in);
        int pagina;
        String tipoSesion = conSeguridad.ComprobarUsuario();

        if (tipoSesion.equals("Administrador")) {
            do {
                do {
                    System.out.println("------Menú Principal------");
                    System.out.println("1. Publicar contenido");
                    System.out.println("2. Eliminar contenido");
                    System.out.println("3. Cerrar sesión");
                    System.out.println("Seleccione una opción del 1 al 3: ");
                    pagina = input.nextInt();
                } while (pagina < 1 || pagina > 3);
                switch (pagina) {
                    case 1:
                        conPublicarContenido.PublicarContenidos(conCrearContenidoImprimir.getConCrearContenido().getContenidos());
                        break;
                
                    case 2:
                        conElimiarContenido.EliminarContenidos(conCrearContenidoImprimir.getConCrearContenido().getContenidos());
                        break;

                    case 3:
                    System.exit(0);
                        break;
                }
            } while (pagina != 4);
        }
        else if (tipoSesion.equals("Editor")) {
            do {
                do {
                    System.out.println("------Menú Principal------");
                    System.out.println("1. Crear contenido");
                    System.out.println("2. Editar contenido");
                    System.out.println("3. Cerrar sesión");
                    System.out.println("Seleccione una opción del 1 al 3: ");
                    pagina = input.nextInt();
                } while (pagina < 1 || pagina > 3);
                switch (pagina) {
                    case 1:
                        conCrearContenidoImprimir.IngresarNuevoContenido();
                        break;
                
                    case 2:
                        conEditarContenido.EditarContenidos(conCrearContenidoImprimir.getConCrearContenido().getContenidos());
                        break;

                    case 3:
                    System.exit(0);
                        break;
                }
            } while (pagina != 4);
        }

    }
}

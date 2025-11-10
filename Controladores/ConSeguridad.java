package Controladores;

import java.util.ArrayList;
import java.util.Scanner;

import UsuariosApp.Administrador;
import UsuariosApp.Editor;
import UsuariosApp.Usuario;

public class ConSeguridad {

    private ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    private int pagina;
    private String nombre;
    private String contrasena;
    private int rol;
    private String retorno = null;
    private boolean usuarioRegistrado = false;

    public ConSeguridad(){
    }

    public String ComprobarUsuario () {
        do {
            do {
                System.out.println("------ EGA biblioteca digital------");
                System.out.println("1. Ingresar usuario");
                System.out.println("2. Crear usuario");
                System.out.println("3. Salir");
                System.out.println("Seleccione una opción del 1 al 3: ");
                pagina = input.nextInt();
            } while (pagina < 1 || pagina > 3);
            if (pagina == 1) {
                if (ListaUsuarios.isEmpty()) {
                    System.out.println("No hay usuarios registrados en el sistema");
                    }
                else {
                        input.nextLine();
                        System.out.println("------Ingrese su nombre de usuario------");
                        nombre = input.nextLine();
                        System.out.println("------Ingrese su contraseña------");
                        contrasena = input.nextLine();
                        for (Usuario usuario : ListaUsuarios) {
                            if (nombre.equals(usuario.getNombre()) && contrasena.equals(usuario.getContrasena())) {
                                System.out.println("-------Bienvenido-------");
                                try{Thread.sleep(1000);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                                retorno = usuario.getRol();
                                usuarioRegistrado = true;
                            }
                        }
                        if (usuarioRegistrado == false) {
                            System.out.println("No hay ningun usuario registrado con ese nombre o contraseña");
                        }
                    }
                }
            else if (pagina == 2) {
                input.nextLine();
                System.out.println("------Ingrese el nombre de usuario------");
                nombre = input.nextLine();
                System.out.println("------Ingrese la contraseña------");
                contrasena = input.nextLine();
                System.out.println("------ Rol ------");
                System.out.println("1. Administrador");
                System.out.println("2. Editor");
                System.out.println("Seleccione una opción del 1 al 2: ");
                rol = input.nextInt();
                if (rol == 1) {
                    Administrador administrador = new Administrador(nombre, contrasena);
                    ListaUsuarios.add(administrador);
                    System.out.println("Usuario creado con éxito");
                }
                else if (rol == 2) {
                    Editor editor = new Editor(nombre, contrasena);
                    ListaUsuarios.add(editor);
                    System.out.println("Usuario creado con éxito");
                }
            }
            else if (pagina == 3) {
                System.exit(0);
            }
        } while (pagina != 3 && retorno == null);
        return retorno;
    }
}

import mx.utng.sesion07.Lector;
import mx.utng.sesion07.ListaTareas;
import mx.utng.sesion07.Menu;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListaTareas lista = new ListaTareas();

        byte opcionSeleccionada = 0;

         do{
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.println("\n\nLa opcion seleccionada es: "+opcionSeleccionada);

            switch (opcionSeleccionada){
                case 1:
                    lista.CrearNuevaLista();
                case 2:
                    lista.verListaTareas();
                case 3:
                    lista.verListaTareas();
                case 4:
                    lista.actualizarListaTareas();
                case 5:
                    lista.eliminarListaTareas();
                case 6:
                    System.out.println("Saliendo de la aplicacion... Adios");
                    break;
                default:
                System.out.println("Opcion desconocida");
                    break;
            }
        }
        
    }
    
    }


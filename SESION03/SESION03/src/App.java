import mx.utng.sesion03.Autor;
import mx.utng.sesion03.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor ();
        autor.setNombre ("Mirza");
        autor. setApellido("Morales");
        autor.setEdad(18);

        Libro libro = new Libro ();
        libro.setTitulo("Cronicas de la vida");
        libro.setAutor(autor);
        libro.setAnio(2024);
        libro.setNumeroPaginas(218);

        System.out.println("Libro:" +libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor() .getNombre()+" "+libro.getAutor() .getApellido());

    }
}

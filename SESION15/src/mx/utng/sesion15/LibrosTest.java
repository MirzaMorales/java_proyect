package mx.utng.sesion15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrosTest {
    public static void main(String[] args) {
        //Crear Queue (Colas)
        //cuando se pone entre <> indica un parametro
        Queue<Libro> libros = new PriorityQueue<>();
        libros.add (new Libro ("Libro 1", 3));
        libros.add (new Libro ("Libro 2", 1));
        libros.add (new Libro ("Libro 3", 2));
        System.out.println(libros);

        Libro libro = null;

        while ((libro = libros.poll()) != null) {
            System.out.println(libro.getTitulo());
        }
        //sale corchetes en la ejecucion pq quiere decir una cola basia
        System.out.println(libros);
    }
}

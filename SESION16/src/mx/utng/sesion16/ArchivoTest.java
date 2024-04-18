package mx.utng.sesion16;

import java.io.File;
import java.io.IOException;

public class ArchivoTest {
    public static void main(String[] args) throws IOException{

        //C:/temp/cursos/cursos.txt
        File archivo = new File("C:/temp/cursos/cursos.txt");
        //Consultar el nombre, ruta, direcctorio padre, si esta oculto,
        //si existe o no existe el archivo
        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Ruta absolut: "+archivo.getAbsolutePath());
        System.out.println("Directorio de archivo: "+archivo.getParent());
        System.out.println("Existe: "+(archivo.exists()?"Si":"No"));
        //Esta oculto?
        System.out.println("Es coulto :"+(archivo.isHidden()?"Si":"No"));

        //TSe puede escribir 
        System.out.printf("%s se puede escribirse%n",archivo.canWrite()?"Si":"No");
        //Se puede leer?
        System.out.printf("%s se puede leer?%n",archivo.canRead()?"Si":"No");
        //Es direcctorio
        System.out.printf("%s se puede ejecutar%n",archivo.canExecute()?"Si":"No");
        //Es direcctorio
        System.out.printf("%s es direcctorio%n",archivo.isDirectory()?"Si":"No");
        //Cuanto espacio ocupa en bytes
        System.out.printf("%s bytes de tamaño%n",archivo.length());
        //En kilobytes
        System.out.printf("%.3f kilobytes de tamaño%n",archivo.length());
    }
}

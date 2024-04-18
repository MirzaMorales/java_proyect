package mx.utng.sesion18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author Mirza Morales
 * @category GDS0622
 * @since 07/02/24
 */

public class Binarios {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
    //(Archivo de entrada) Crear un manejador de entrada de archivos binarios
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\java-proyect\\SESION18\\src\\mx\\utng\\sesion18\\Humbe.jpg"));
    //Archivo de salida (crear copia)
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\java-proyect\\SESION18\\src\\mx\\utng\\sesion18\\copia_Humbe.jpg"));

    //Comenzar una copia
    byte[] buffer = new byte[1024];

    int bytesLeidos = 0;   

    while (((bytesLeidos = bis.read(buffer)))>0){
        bos.write(buffer, 0, bytesLeidos);
    }
    bis.close();
    bos.close();
}
}

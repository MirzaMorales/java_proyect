package mx.utng.sesion23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    //aqui se esta sobreescribiendo el metodo log
    @Override
    public void log(String msg) {
        try {//try se utiliza para manejar errores (los ejecuta) sino se logra ejecutar lo manda a catch
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.mx"));
            writer.write(msg);
            writer.close();
        } catch (IOException e) {//En el bloque catch se hace todo lo que quieres que haga en caso de que no sirva el try
            System.out.println("Errod de I/O"+ e.getMessage());
        }
        
    }
}

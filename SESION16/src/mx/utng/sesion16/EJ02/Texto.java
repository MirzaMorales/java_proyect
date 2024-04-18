package mx.utng.sesion16.EJ02;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class Texto {
    public static void main(String[] args) throws IOException{
        //Escribir en el archivo
        FileWriter fileWriter = new FileWriter(
            System.getProperty("user.home")+"/archivo.txt");
    //System.out.println(fileWriter);
    BufferedWriter bw = new BufferedWriter(fileWriter);
    bw.write("Esta linea se escribira en el archivo");
    bw.newLine();
    bw.write("Esta es una segunda linea");
    bw.newLine();
    bw.write("Esta es la ultima lines");
    bw.write("%n Se mi valentin");
    bw.close();

    BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo,txt"));

    //Leer todo el archivo
    String linea = null;
    while ((linea = br.readLine())!=null) {
        System.out.println(linea);
    }
    }
}

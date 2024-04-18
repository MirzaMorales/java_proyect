package mx.utng.sesion17.Reto3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * @author Mirza Morales
 * @category GDS0622
 * @since 16/02/24
 */
public class Poema {
    public static void main(String[] args) throws IOException{
        //Escribir el archivo
        FileWriter fileWriter = new FileWriter(
            System.getProperty("user.home")+"/poema.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Te vi y pense");
            bw.newLine();
            bw.write("tengo que conocerte,");
            bw.newLine();
            bw.write("te conoci y pense");
            bw.newLine();
            bw.write("ojala nos enamoremos,");
            bw.newLine();
            bw.write("nos enamorados");
            bw.newLine();
            bw.write("y pense");
            bw.newLine();
            bw.write("debo estar soñando");
            bw.newLine();
            bw.write("y no lo estaba...");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/poema.txt"));

            String linea = null;
            while ((linea = br.readLine())!=null){
                System.out.println(linea);
            }
        
    }
}

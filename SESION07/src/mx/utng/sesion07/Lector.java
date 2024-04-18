package mx.utng.sesion07;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.println("Opcion: ");
        return scanner.nextByte();
    }
    
}

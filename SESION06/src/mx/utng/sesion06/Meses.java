package mx.utng.sesion06;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Teclea mes actual: ");


        String mesActual = scanner.nextLine().toLowerCase();
        scanner.close();
        switch (mesActual) {
            case "enero":
                System.out.print(" febrero,");
            case "febrero":
                System.out.print(" marzo,");  
            case "marzo":
                System.out.print(" abril,");
            case "abril":
                System.out.print(" mayo,");
            case "mayo":
                System.out.print(" junio,");
            case "junio":
                System.out.print(" julio,");
            case "julio":
                System.out.print(" agosto,");
            case "agosto":
                System.out.print(" septiembre,");
            case "septiembre":
                System.out.print(" nobiembre,");
            case "noviembre":
                System.out.print(" diciembre.");
                break;
            case "diciembre":
                System.out.println(" estas en el ultimo mes del año,");
            default:
                break;
        }
    }

}

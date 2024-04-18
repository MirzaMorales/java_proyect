package mx.utng.sesion05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String mensaje;
        try (//Defino objeto Scanner
        Scanner scanner = new Scanner (System.in)) {
            System.out.println("Teclea tu calificacion: ");
            int calif = scanner.nextInt();

            switch (calif) {
                case 10:
                     mensaje = "Excelente";
                    break;
                case 9:
                case 8:
                    mensaje = "Muy bien";
                    break;
                case 7:
                    mensaje = "Bien hecho";
                    break;
                case 6:
                    mensaje = "Apenas hijo";
                    break;
                case 5:
                    mensaje = "Toco R1 pa";
                    break;
                default:
                    mensaje = "¡¡Calificacion invalida!!";
                    break;
            }
        }
        System.out.println(mensaje);
    }
    
}

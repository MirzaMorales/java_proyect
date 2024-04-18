package mx.utng.sesion05;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        try (//Defino objeto scanner
        Scanner scanner = new Scanner (System.in)) {
            System.out.println("Teclea tu calificacion: ");
            int calif = scanner.nextInt();
            
            if (calif == 10) {
                System.out.println("Excelente");
            }else 

            if (calif == 8 || calif == 9) {
                System.out.println("Muy bien");
                
            }else

            if (calif == 7) {
                System.out.println("Puedes hacerlo mejor");
                
            }else

            if (calif == 6) {
                System.out.println("Apenas");
                
            }else

            if (calif <= 5) {
                System.out.println("Toco R1");
                
            }else{
                System.out.println("¡¡Calificacion invalida!!");
            }
        }

        }
    }
    

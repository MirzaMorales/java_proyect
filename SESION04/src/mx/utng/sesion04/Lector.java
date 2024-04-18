package mx.utng.sesion04;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        try (//crear un lector de valores desde la terminal
        Scanner lector = new Scanner (System.in)) {
            System.out.println("Teclea tu nombre: ");
            //Leer lo que el usuario mande como entrada
            String nombre = lector.nextLine();
            System.out.println("Hola "+ nombre);
            //Interpretacion
            int edad = 18;
            boolean casado = false;
            System.out.printf("Hola me llamo %s y tengo %d años tristemente %s casada", nombre, edad, casado==true?"soy":"no soy");
        }
        
    }

    //Metodo mientras una cadena dada como parametro
    public void muestraMenasaje(String mensaje){
        System.out.println(mensaje);
    }

    //Leer a partir del scanner
    public String leerEntrada(){
        return scanner.nextLine();
    }
}

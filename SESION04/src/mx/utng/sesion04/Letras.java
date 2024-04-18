package mx.utng.sesion04;

public class Letras {
    public static void main(String[] args) {
        //crear un lector
        Lector lector = new Lector();
        lector.muestraMenasaje("Teclea una palabra; ");
        String palabra = lector.leerEntrada();

        //Crear un nuevo objeto contador caracteres
        ContadorCaracteres contador = new ContadorCaracteres();

        int numeroVocales = contador.cuentaVocales (palabra);
        System.out.println("Hay "+numeroVocales+" vocales");

        int numeroConsonantes = contador.cuentaConsonantes (palabra);
        System.out.println("Hay "+numeroConsonantes+" consonantes");

        int numeroSimbolos = contador.cuentaSimbolos (palabra);
        System.out.println("Hay "+numeroSimbolos+" simbolos");

        int numeroNumeros = contador.cuentaNumeros (palabra);
        System.out.println("Hay "+numeroNumeros+" numeros");
    }
    
}

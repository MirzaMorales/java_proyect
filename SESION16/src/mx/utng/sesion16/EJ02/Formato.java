package mx.utng.sesion16.EJ02;

import java.time.LocalDate;
public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Bobbie";
        final int EDAD = 3;
        final float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2020, 8, 13);

        System.out.println("El nombre de mi mascota es "+NOMBRE+", tiene una edad de "+EDAD+" años, mide aproximadamente "+ESTATURA+ ", y nacio el dia "+FECHA_NACIMIENTO);
                                                                            // (%05d) aqui puso 5 espacios reprecentados con cereo                //(%4$tb) b minuscula pone la fecha abreviada y B mayudcula la pone completa
        System.out.printf("El nombre de mi mascota es |%8s| tiene una edad de %05d años, mide aproximadamente %.1f y nacio el dia %4$te del mes %4$tb del %4$ty %n", NOMBRE, EDAD, ESTATURA, FECHA_NACIMIENTO);
    }                                                                                                        // (%.2f) aqui se marcaron 2 cifras despues del punto
}   

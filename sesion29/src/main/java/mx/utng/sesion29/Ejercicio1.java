package mx.utng.sesion29;

import java.util.function.Function;

public class Ejercicio1 {

    //private final StringToInterger parser = Integer::parseInt;
    
    private final Function<String,Integer> parser=Integer::parseInt;

    Integer sumar (String a, String b){
        return parser.apply(a)+parser.apply(b);
    }
}

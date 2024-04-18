import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
    //añadir una lista materias

    List<String> materias = new ArrayList<>();
    //List<String> materias = new ArrayList<>; (Comentado pq es para una lista de numeros)

    materias.add("POO");
    Collections.addAll(materias, "FSC", "BD", "MMDS", "I", "IR", "FM");
    System.out.println(materias);
    
    //para cada materia de las materias imprime un renglon por materia
    for (String materia : materias) {
        System.out.println(materia);
    }
    //revierte el orden de la lista
    Collections.reverse(materias);
    System.out.println(materias);

    //cual es la mas pequeña por orden alfabetico
    System.out.println("Mas pequeña: "+Collections.min(materias));

    //cual es la mas grande por oden alfabetico
    System.out.println("Mas grande: "+Collections.max(materias));

    //ordenar alfabeticamente
    Collections.sort(materias);
    System.out.println(materias);

    //para saber donde se encuentra (posicion)
    System.out.println("MMDS se encuentra en la posicion: "+(Collections.binarySearch(materias, "MMDS")+1));

    //añadir tres materias mas
    Collections.addAll(materias, "POO", "POO", "POO");
    System.out.println(materias);

    //desordenar la lista
    Collections.shuffle(materias);
    System.out.println(materias);

    //Como saber cuantas veces aparece POO
    System.out.println("Hay "+Collections.frequency(materias, "POO")+" POO en la lista");
    }
}

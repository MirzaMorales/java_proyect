package mx.utng.sesion10.Ej01;

public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador(){
        contadorClase++;
        contadorInstancia++;
    }

    public static short getContadorClase() {
        return contadorClase;
    }
    
    public short getContadorInstancia() {
        return contadorInstancia;
    }

    public void setContadorInstancia(short contadorInstancia) {
        this.contadorInstancia = contadorInstancia;
    }


}

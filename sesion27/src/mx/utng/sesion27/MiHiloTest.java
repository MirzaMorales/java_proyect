package mx.utng.sesion27;

public class MiHiloTest {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        //hilo1.setDaemon(false);
        MiHilo hilo2 = new MiHilo();
        hilo2.setDaemon(false);

        hilo1.start();
        hilo2.start();

        MiHilo.pausarUnSegundo();
        hilo1.setParametro("terminar");
    }
}

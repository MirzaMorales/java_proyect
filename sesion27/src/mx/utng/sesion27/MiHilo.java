package mx.utng.sesion27;

//hilo se refiere a la ejecucion de un programa ***Procesos que estas ejecutandose
//simultameanemte)

//daemon son procesos que se ejecutan en segundo plano

import java.util.concurrent.TimeUnit;

public class MiHilo extends Thread{
    private String parametro;

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
    
    //Los bloques try catch traran de ejecutar las instrucciones dentro del try 
    //(continua la ejecucion aun con un error)
    /*
     * try { Trata de hacer este codigo
     * catch{ sino puedes has esto
     * finally{ finalmente has esto
     */
    @Override
    public void run() {
        while (!"terminar".equals(parametro)) {
            mostrarInfo();
            pausarUnSegundo();   
        }
    }

    private void mostrarInfo(){
        String tipoHilo = isDaemon()?"Daemon":"Usuario";
        System.out.println(tipoHilo+"/t| Nombre: "+getName()+"/t| ID:"+getId()+"/t|");
    }

    public static void pausarUnSegundo(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

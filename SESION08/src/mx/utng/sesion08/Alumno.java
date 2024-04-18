package mx.utng.sesion08;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;
    
    {
        curso = "Programacion orientada a objetos";
        sesion = 8;
        objetivo = "Bloques inicializacion";
    }

    {
        curso = "Base de datos";
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public byte getSesion() {
        return sesion;
    }
    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    


}

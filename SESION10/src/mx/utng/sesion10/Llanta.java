package mx.utng.sesion10;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
        
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public float getDiametro() {
        return diametro;
    }
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    public float getPresion() {
        return presion;
    }
    public void setPresion(float presion) {
        this.presion = presion;
    }
    public void rodar(){
        System.out.println("Rodando...");
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj == null|| getClass() != obj.getClass()) return false;

        Llanta that = (Llanta)obj;
        if(Float.compare(that.ancho, this.ancho) !=0) return false;
        if(Float.compare(that.diametro, this.diametro) !=0) return false;
        if(Float.compare(that.presion, this.presion) !=0) return false;
        return false;
    }
}

package mx.utng.sesion10;

public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj == null|| getClass() != obj.getClass()) return false;

        Automovil that = (Automovil)obj;
        
        if(!that.marca.equals(this.marca)) return false;
        if(!that.modelo.equals(this.modelo)) return false;
        if(that.anioFabricacion!=this.anioFabricacion) return false;
        if(that.kilometraje!=this.kilometraje) return false;
        if(!Arrays.equals(that.llantas, this.llantas)) return false;
        return that.combustible.equals(this.combustible);
    }

    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash+=marca.hashCode();
        hash+=modelo.hashCode();
        hash+=anioFabricacion;
        hash+=kilometraje;
        return hash;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llanta delanteraIzquierda, Llanta DelateraDerecha, Llanta TraseraIzquierda, Llanta TraseraDerecha,
     Llanta delanteraDerecha,
     Llanta traseraIzquierda,
     Llanta traseraDerecha){
        llantas [0] = delanteraIzquierda;
        llantas [1] = delanteraDerecha;
        llantas [2] = traseraIzquierda;
        llantas [3] = traseraDerecha;
     }

     public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
     }

     public void avanzar(){
        if (combustible.getLitrosActuales() > 0){
            for (Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();
        }else{
            System.out.println("No hay combustible");
        }
     }

     
}

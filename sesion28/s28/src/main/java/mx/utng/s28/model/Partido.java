package mx.utng.s28.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Partido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //Es una relacion de muechos a uno
    @JoinColumn(name = "id_equipo1", referencedColumnName = "id") //para crear las FK
    private Equipo equipo1;

    @ManyToOne //Es una relacion de muechos a uno
    @JoinColumn(name = "id_equipo2", referencedColumnName = "id")
    private Equipo equipo2;

    @Column(name = "marcador_local")
    private Integer marcadorEquipo1;

    @Column(name = "marcador_visitante")
    private Integer macadorEquipo2;

//========== Generamos getters y setters ==============
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    public Integer getMarcadorEquipo1() {
        return marcadorEquipo1;
    }
    public void setMarcadorEquipo1(Integer marcadorEquipo1) {
        this.marcadorEquipo1 = marcadorEquipo1;
    }
    public Integer getMacadorEquipo2() {
        return macadorEquipo2;
    }
    public void setMacadorEquipo2(Integer macadorEquipo2) {
        this.macadorEquipo2 = macadorEquipo2;
    }

//======== Generamos hashcode y equals ================================
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((equipo1 == null) ? 0 : equipo1.hashCode());
        result = prime * result + ((equipo2 == null) ? 0 : equipo2.hashCode());
        result = prime * result + ((marcadorEquipo1 == null) ? 0 : marcadorEquipo1.hashCode());
        result = prime * result + ((macadorEquipo2 == null) ? 0 : macadorEquipo2.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Partido other = (Partido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (equipo1 == null) {
            if (other.equipo1 != null)
                return false;
        } else if (!equipo1.equals(other.equipo1))
            return false;
        if (equipo2 == null) {
            if (other.equipo2 != null)
                return false;
        } else if (!equipo2.equals(other.equipo2))
            return false;
        if (marcadorEquipo1 == null) {
            if (other.marcadorEquipo1 != null)
                return false;
        } else if (!marcadorEquipo1.equals(other.marcadorEquipo1))
            return false;
        if (macadorEquipo2 == null) {
            if (other.macadorEquipo2 != null)
                return false;
        } else if (!macadorEquipo2.equals(other.macadorEquipo2))
            return false;
        return true;
    }

    

    
}

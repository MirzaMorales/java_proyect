package mx.utng.sesion26.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Transport {
    
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty //Es para que no se quede basio (not null)
    @Column (length = 30)
    private String driver; //Nombre del conductor

    @Column (length = 30)
    private String route; //ruta del autobis

    @NotEmpty
    @Column (length = 30)
    private String seating; //Asientos en el autobus

    @Min(value = 5, message = "El transporte debe hacer minino 5 paradas")
    @Max(value = 10, message = "El transporte no puede exceder las de 10 paras")
    private Float stops;  //paradas del autobus

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public Float getStops() {
        return stops;
    }

    public void setStops(Float stops) {
        this.stops = stops;
    }


    
}

package mx.utng.sesion26.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;

@Entity  //Long en mayuscula es un super conjunto (envuelve al tipo de long para darle mas funcionalidades)
public class Student {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty //Es para que no se quede basio (not null)
    @Column (length = 30)
    private String name;

    @Column (length = 30)
    private String middleName;

    @NotEmpty
    @Column (length = 30)
    private String lastName;

    @Min(value = 0, message = "No puede ser menor a 0")
    @Max(value = 10, message = "No puede ser mayor a 10")
    private Float average;

    @Temporal(TemporalType.DATE)//esto restringe a que gusrade una fecha y ninguna hora
    private Date recordAt;

    @PrePersist
    public void prePersist(){ //Registra hora y fechas actuales
        recordAt = new Date();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public Float getAverage() {
        return average;
    }
    public Date getRecordAt() {
        return recordAt;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAverage(Float average) {
        this.average = average;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }

    
}

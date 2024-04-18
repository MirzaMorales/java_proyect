package mx.utng.sesion26.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Max;


@Entity
public class Support {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty //Es para que no se quede basio (not null)
    @Column (length = 30)
    private String studentName; //nombre del estudiante

    @Column (length = 30)
    private String type; //tipo de beca solicitada

    @NotEmpty
    @Column (length = 30)
    private String group; //grupo del alumno

    @Min(value = 0, message = "No puede ser menor a 0")
    @Max(value = 10, message = "No puede ser mayor a 10")
    private Float average; //promedio del estudiante

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    

}

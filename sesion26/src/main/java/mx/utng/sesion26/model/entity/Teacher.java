package mx.utng.sesion26.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Max;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Teacher {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column (length = 90)
    private String name;

    @Min (0)
    @Max(50)
    private int yearsOfService;

    @Temporal(TemporalType.TIMESTAMP)
    private Date recordAt;

    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Date getRecordAt() {
        return recordAt;
    }

    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }
    
}

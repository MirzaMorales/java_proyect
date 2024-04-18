package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Student;
/*
 * crear una clase repositorio o dao, (permite estar trabajando con datos) utlizare la anotacion @Repositorio 
 * una clase repositorio permite guardar
 */
@Repository
public class StudentDaoImpl implements IStudentDao{

    //Entity Manager y contexto de persistencia (gestor de entidad)
    //El EntityManager guarda internamente todas las entidades y utiliza como una cache de datos de la base de datos
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> list() {
        return em.createQuery("from Student").getResultList();
    }

    @Override
    public void save(Student student) {
        if(student.getId() !=null && student.getId() > 0){
            //actualizar valores de estudiante
            em.merge(student);
        }else{
            //creamos un nuevo estudiante en la base
            em.persist(student);
        }
    }

    @Override
    public Student getById(Long id) {
        //metodo para encontrar al estudiante (quiero que me muestres al estudiente con la id ...)
        return em.find(Student.class, id);
    }

    @Override
    public void delete(Long id) {
        //borrar el estudiante que encontro en la base de datos
        Student student = getById(id);
        em.remove(student);
    }
    
}

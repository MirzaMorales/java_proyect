package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Teacher;
/*
 * crear una clase repositorio o dao, (permite estar trabajando con datos) utlizare la anotacion @Repositorio 
 * una clase repositorio permite guardar
 */
@Repository
public class TeacherDaoImpl implements ITeacherDao{
    //Entity Manager y contexto de persistencia (gestor de entidad)
    //El EntityManager guarda internamente todas las entidades y utiliza como una cache de datos de la base de datos
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Teacher> list() {
        return em.createQuery("from Teacher").getResultList();
    }

    @Override
    public void save(Teacher teacher) {
        if(teacher.getId() !=null && teacher.getId() > 0){
            //actualizar valores de estudiante
            em.merge(teacher);
        }else{
            //creamos un nuevo estudiante en la base
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        //metodo para encontrar al estudiante (quiero que me muestres al estudiente con la id ...)
        return em.find(Teacher.class, id);
    }

    @Override
    public void delete(Long id) {
        //borrar el estudiante que encontro en la base de datos
        Teacher teacher = getById(id);
        em.remove(teacher);
    }
}

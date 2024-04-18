package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Support;

@Repository
public class SupportDaoImpl implements ISupportDao{
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Support> list() {
        return em.createQuery("from Support").getResultList();
    }

    @Override
    public void save(Support support) {
        if(support.getId() !=null && support.getId() > 0){
            //actualizar valores de beca
            em.merge(support);
        }else{
            //creamos una nueva beca en la base
            em.persist(support);
        }
    }

    @Override
    public Support getById(Long id) {
        //metodo para encontrar el id de beca (quiero que me muestres la beca con la id ...)
        return em.find(Support.class, id);
    }

    @Override
    public void delete(Long id) {
        //borrar la beca que encontro en la base de datos
        Support support = getById(id);
        em.remove(support);
    }
}


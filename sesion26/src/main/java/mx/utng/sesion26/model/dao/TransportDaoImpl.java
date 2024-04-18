package mx.utng.sesion26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import mx.utng.sesion26.model.entity.Transport;
import org.springframework.stereotype.Repository;

@Repository
public class TransportDaoImpl implements ITransportDao{
    @Autowired
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Transport> list() {
        return em.createQuery("from Transport").getResultList();
    }

    @Override
    public void save(Transport transport) {
        if(transport.getId() !=null && transport.getId() > 0){
            //actualizar valores del transport
            em.merge(transport);
        }else{
            //creamos un nuevo transporte en la base
            em.persist(transport);
        }
    }

    @Override
    public Transport getById(Long id) {
        //metodo para encontrar al transporte (quiero que me muestres el transporte con la id ...)
        return em.find(Transport.class, id);
    }

    @Override
    public void delete(Long id) {
        //borrar el transporte que encontro en la base de datos
        Transport transport = getById(id);
        em.remove(transport);
    }
    
}

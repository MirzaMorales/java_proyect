package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.ITransportDao;
import mx.utng.sesion26.model.entity.Transport;

@Service 
public class TransportServiceImpl implements ITransportSerivice {
    
    @Autowired //genera en automatico una isntancia para porla utilizar 
    private ITransportDao dao;

    @Transactional(readOnly = true)//Nos va a servir solo para leer informacion (no va a modificar nada en la base)
    @Override
    public List<Transport> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Transport transport) {
        dao.save(transport);
    }

    @Transactional(readOnly = true)
    @Override
    public Transport getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}

package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.ISupportDao;
import mx.utng.sesion26.model.entity.Support;

@Service
public class SupportServiceImpl implements ISupportService{
    
    @Autowired //genera en automatico una isntancia para porla utilizar 
    private ISupportDao dao;

    @Transactional(readOnly = true)//Nos va a servir solo para leer informacion (no va a modificar nada en la base)
    @Override
    public List<Support> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Support support) {
        dao.save(support);
    }

    @Transactional(readOnly = true)
    @Override
    public Support getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    } 
}

package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.ITeacherDao;
import mx.utng.sesion26.model.entity.Teacher;

@Service
public class TeacherServiceImpl implements ITeacherService{
    @Autowired //genera en automatico una isntancia para porla utilizar 
    private ITeacherDao dao;

    @Transactional(readOnly = true)//Nos va a servir solo para leer informacion (no va a modificar nada en la base)
    @Override
    public List<Teacher> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Teacher teacher) {
        dao.save(teacher);
    }

    @Transactional(readOnly = true)
    @Override
    public Teacher getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    } 
}

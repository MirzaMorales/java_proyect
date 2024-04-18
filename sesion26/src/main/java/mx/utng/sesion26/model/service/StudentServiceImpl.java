package mx.utng.sesion26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.sesion26.model.dao.IStudentDao;
import mx.utng.sesion26.model.entity.Student;

/*
 * Una clase service, esta basada en el patron de diseño fachada
 * es un unico punto de acceso hacia los DAOs (Data Opcion), dentro de la clase
 * service, podemos operar con distintas clases DAO
 */

@Service
public class StudentServiceImpl implements IStudentService{

    //inyectar la interface par autilizar los metodos de CRUD 
    //(C-create, R-read retrive, U-update, D-delete

    @Autowired //genera en automatico una isntancia para porla utilizar 
    private IStudentDao dao;

    @Transactional(readOnly = true)//Noa va a servir solo para leer informacion (no va a modificar nada en la base)
    @Override
    public List<Student> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Student student) {
        dao.save(student);
    }

    @Transactional(readOnly = true)
    @Override
    public Student getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
    
}

package mx.utng.sesion26.model.dao;

import mx.utng.sesion26.model.entity.Student;

import java.util.List;

public interface IStudentDao {//aqui aplicaremos las acciones basicas de un objeto con acceso a datos
    List<Student> list();
    void save (Student student);
    Student getById(Long id);
    void delete(Long id);    
}

/*
 * @autor:Morales Lezama Mirza Natzielly
 * @category:GDS0622
 * @since: 17-03-2024
 */
package mx.utng.sesion26.model.dao;

import mx.utng.sesion26.model.entity.Teacher;

import java.util.List;


public interface ITeacherDao {
    List<Teacher> list();
    void save (Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);
}

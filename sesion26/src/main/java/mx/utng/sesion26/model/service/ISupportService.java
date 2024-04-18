package mx.utng.sesion26.model.service;

import java.util.List;

import mx.utng.sesion26.model.entity.Support;

public interface ISupportService {
    List<Support> list();
    void save(Support support);
    Support getById(Long id);
    void delete(Long id);
}

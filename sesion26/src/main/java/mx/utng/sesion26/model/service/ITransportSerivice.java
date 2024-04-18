package mx.utng.sesion26.model.service;

import java.util.List;

import mx.utng.sesion26.model.entity.Transport;

public interface ITransportSerivice {
    List<Transport> list();
    void save(Transport transport);
    Transport getById(Long id);
    void delete(Long id);
}

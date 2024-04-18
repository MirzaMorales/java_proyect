package mx.utng.s28.persistence;

import mx.utng.s28.model.Partido;
import org.springframework.data.repository.CrudRepository;


public interface PartidoRepository extends CrudRepository <Partido, Long>{
    
}

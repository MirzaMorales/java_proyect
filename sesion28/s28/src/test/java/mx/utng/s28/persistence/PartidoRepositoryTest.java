package mx.utng.s28.persistence;

import mx.utng.s28.model.Equipo;
import mx.utng.s28.model.Partido;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PartidoRepositoryTest {
    
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private PartidoRepository partidoRepository;

    @BeforeAll //Antes de hacer cualquier cosa
    void cleanDataBase(){
        partidoRepository.deleteAll(); //Borra todo lo que tiene la base de datos
    }


    @Test
    @DisplayName("Prueba guardar partido")
    void canSave(){
        //instancio un equipo
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        equipo1.setNombre("America");
        equipo2.setNombre("Victoria");

        //Guardo el equipo
        equipoRepository.save(equipo1);
        equipoRepository.save(equipo2);


        Partido partido = new Partido();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setMarcadorEquipo1(0);
        partido.setMacadorEquipo2(0);

        partidoRepository.save(partido);




        //Prueba de que exista un id en el equipo
        assertNotNull(equipo1.getId());
        assertNotNull(equipo2.getId());
    }

}

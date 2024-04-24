package com.riwi.Eventos.Repository;

import com.riwi.Eventos.Entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Evento, String> {

    //Aqui tiene que tener el mismo nombre de la entidad
    public Evento findByNombre(String name);

}

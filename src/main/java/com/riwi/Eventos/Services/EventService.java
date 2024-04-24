package com.riwi.Eventos.Services;

import com.riwi.Eventos.Entity.Evento;
import com.riwi.Eventos.Repository.EventRepository;
import com.riwi.Eventos.Services.IServices.AbstService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService implements AbstService {

    @Autowired
    private final EventRepository objEventoRep;

    @Override
    public Evento save(Evento evento) {
        return this.objEventoRep.save(evento);
    }

    @Override
    public List<Evento> getAll() {
        return this.objEventoRep.findAll();
    }

    @Override
    public Evento findById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Evento update(String id, Evento objEvento) {
        this.objEventoRep.findById(id).orElseThrow();
        objEvento.setId(id);

        return this.objEventoRep.save(objEvento);
    }

    @Override
    public List<Evento> search(String name) {
        return null;
    }

}

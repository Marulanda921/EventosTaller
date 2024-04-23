package com.riwi.Eventos.Services.IServices;

import com.riwi.Eventos.Entity.Evento;

import java.util.List;

public interface AbstService {
    public Evento save(Evento evento);
    public List<Evento> getAll();
    public Evento findById(String id);

    public void delete(String id);

    public Evento update(String id, Evento objEvento);
    public List<Evento> search(String name);

}

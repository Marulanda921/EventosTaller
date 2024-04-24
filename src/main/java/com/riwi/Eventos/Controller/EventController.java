package com.riwi.Eventos.Controller;

import com.riwi.Eventos.Entity.Evento;
import com.riwi.Eventos.Services.IServices.AbstService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eventos")
@AllArgsConstructor
public class EventController {

    @Autowired
    private final AbstService objService;

    @GetMapping
    public ResponseEntity<List<Evento>> getAll(){
        return ResponseEntity.ok(this.objService.getAll());
    }

    @PostMapping
    public ResponseEntity<Evento> insert(@RequestBody Evento objProduct){
       return ResponseEntity.ok(this.objService.save(objProduct));
    }



}

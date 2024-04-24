package com.riwi.Eventos.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "Evento")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private int capacidad;

}


/*
 * {
    "nombre": "Alejandro",
    "fecha": "22-03-2004",
    "ubicacion": "Risaralda",
    "capacidad": 10
}
 */

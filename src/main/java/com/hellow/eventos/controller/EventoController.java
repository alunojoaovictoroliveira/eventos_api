package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "evento")

public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("todos")
    public List<Evento> getAllEventos(){
        return this.eventoRepository.findAll();
    }

    @PostMapping("add")
    public Evento addEvento(@RequestBody Evento evento){
        this.eventoRepository.save(evento);
        return evento;
    }
}
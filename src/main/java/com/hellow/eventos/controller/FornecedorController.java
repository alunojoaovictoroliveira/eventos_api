package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import com.hellow.eventos.classes.fornecedor.Fornecedor;
import com.hellow.eventos.classes.fornecedor.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping("todos")
    public List<Fornecedor> getAllFornecedores(){
        return this.fornecedorRepository.findAll();
    }

    @PostMapping("add")
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor){
        this.fornecedorRepository.save(fornecedor);
        return fornecedor;
    }
}
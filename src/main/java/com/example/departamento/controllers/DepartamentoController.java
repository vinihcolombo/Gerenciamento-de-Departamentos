package com.example.departamento.controllers;

import com.example.departamento.models.DepartamentoModel;
import com.example.departamento.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @PostMapping
    public DepartamentoModel salvar(@RequestBody DepartamentoModel departamento) {
        return service.salvar(departamento);
    }

    @GetMapping
    public List<DepartamentoModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DepartamentoModel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
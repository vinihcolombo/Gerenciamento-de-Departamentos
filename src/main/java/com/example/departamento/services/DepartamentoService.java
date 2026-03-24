package com.example.departamento.services;

import com.example.departamento.models.DepartamentoModel;
import com.example.departamento.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    public DepartamentoModel salvar(DepartamentoModel departamento) {
        return repository.save(departamento);
    }

    public List<DepartamentoModel> listar() {
        return repository.findAll();
    }

    public DepartamentoModel buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
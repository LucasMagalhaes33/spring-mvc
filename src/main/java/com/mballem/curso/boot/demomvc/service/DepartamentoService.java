package com.mballem.curso.boot.demomvc.service;

import java.util.List;

import com.mballem.curso.boot.demomvc.domain.Departamento;

public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

    boolean depertamentoTemCargos(Long id);
}


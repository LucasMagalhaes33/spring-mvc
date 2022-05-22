package com.mballem.curso.boot.demomvc.service;

import com.mballem.curso.boot.demomvc.domain.Departamento;
import com.mballem.curso.boot.demomvc.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

}

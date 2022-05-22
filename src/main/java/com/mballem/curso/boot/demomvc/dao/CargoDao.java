package com.mballem.curso.boot.demomvc.dao;

import com.mballem.curso.boot.demomvc.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void save (Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}

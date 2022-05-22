package com.mballem.curso.boot.demomvc.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @OneToMany(mappedBy = "cargo") //cargo é o lado fraco da relação e quando for buscar por um cargo já irá aparecer os funcionários relacionados a ele
    private List<Funcionario> funcionarios;
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne //um departamento terá muitos cargos
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

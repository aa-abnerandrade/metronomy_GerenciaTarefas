package com.todoproject.todolist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "todos")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private boolean realizado;

    private int prioridade;


    public ToDo(String nome, String descricao, boolean realizado, int prioridade) {
    }
}

package com.todoproject.todolist.service;


import com.todoproject.todolist.entity.ToDo;
import com.todoproject.todolist.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository todoRepository;

    public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<ToDo> create() {

        return null;
    }

    public List<ToDo> list() {

        return null;
    }

    public List<ToDo> update() {
        return null;
    }

    public List<ToDo> delete() {
        return null;
    }

}

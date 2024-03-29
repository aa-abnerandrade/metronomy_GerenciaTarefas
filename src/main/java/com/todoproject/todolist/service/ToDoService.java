package com.todoproject.todolist.service;


import com.todoproject.todolist.entity.ToDo;
import com.todoproject.todolist.repository.ToDoRepository;
import com.todoproject.todolist.util.BadRequestException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository todoRepository;

    public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<ToDo> create(ToDo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<ToDo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<ToDo> update(Long id, ToDo todo) {

        todoRepository.findById(id).ifPresentOrElse((existingToDo) -> {
            todo.setId(id);
            todoRepository.save(todo);
        }, () -> {
            throw  new BadRequestException("Essa ToDo não existe.");
        });

        return list();
    }

    public List<ToDo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }

}

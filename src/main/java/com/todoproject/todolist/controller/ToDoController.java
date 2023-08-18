package com.todoproject.todolist.controller;


import com.todoproject.todolist.entity.ToDo;
import com.todoproject.todolist.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }
    

    @PostMapping
    List<ToDo> create(@RequestBody ToDo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<ToDo> list() {
        return todoService.list();

    }

    @PutMapping
    List<ToDo> update(@RequestBody ToDo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<ToDo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}

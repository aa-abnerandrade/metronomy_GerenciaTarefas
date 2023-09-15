package com.todoproject.todolist.controller;


import com.todoproject.todolist.entity.ToDo;
import com.todoproject.todolist.service.ToDoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/todos")
public class ToDoController {
    private ToDoService todoService;
    private static Logger logger = LoggerFactory.getLogger(ToDoController.class);


    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }
    

    @PostMapping
    List<ToDo> create(@RequestBody @Valid ToDo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<ToDo> list() {
        logger.info("Listar Tarefas");
        return todoService.list();

    }

    @PutMapping("/{id}")
    List<ToDo> update(@PathVariable ("id") Long id, @RequestBody ToDo todo) {
        return todoService.update(id, todo);
    }

    @DeleteMapping("{id}")
    List<ToDo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}

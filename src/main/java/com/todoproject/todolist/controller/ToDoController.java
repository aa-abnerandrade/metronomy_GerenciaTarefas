package com.todoproject.todolist.controller;


import com.todoproject.todolist.entity.ToDo;
import com.todoproject.todolist.service.ToDoService;
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
    List<ToDo> create(@RequestBody ToDo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<ToDo> list() {
        logger.info("Listar Tarefas");
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

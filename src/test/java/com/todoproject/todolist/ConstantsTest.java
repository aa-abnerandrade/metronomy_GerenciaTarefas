package com.todoproject.todolist;

import com.todoproject.todolist.entity.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ConstantsTest {

    public static final List<ToDo> TODOS = new ArrayList<>() {
        {
            add(new ToDo(101L, "Criar", "Testar Criar", false, 1));
            add(new ToDo(102L, "Ler", "Testar Ler", false, 2));
            add(new ToDo(103L, "Postar", "Testar Postar", false, 3));
            add(new ToDo(104L, "Atualizar", "Testar Atualizar", false, 4));
            add(new ToDo(105L, "Deletar", "Testar Deletar", false, 5));

        }
    };


    public static final ToDo TODO = TODOS.get(0);

}

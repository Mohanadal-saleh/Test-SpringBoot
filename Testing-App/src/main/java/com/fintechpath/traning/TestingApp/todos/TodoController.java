package com.fintechpath.traning.TestingApp.todos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    @GetMapping(value = {"", "/"})
    public List<Todo> listTodos() {
        return Arrays.asList(
                new Todo(1, "First todo", "this is the first todo"),
                new Todo(2, "second todo", "this is the second todo"),
                new Todo(1, "First todo", "this is the first todo")

        );
    }
}

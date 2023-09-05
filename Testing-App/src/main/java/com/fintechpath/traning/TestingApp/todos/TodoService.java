package com.fintechpath.traning.TestingApp.todos;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> Data = Arrays.asList(
            new Todo(1, "First todo", "this is the first todo"),
            new Todo(2, "Second todo", "this is the second todo"),
            new Todo(3, "Third todo", "this is the third todo")
    );

    public List<Todo> findAll() {
        return Data;
    }

    public Todo getTodoById(int id){
        for(Todo todo : Data ){
            if (todo.getId() == id){
                return todo ;
            }
        }
    return null;
    }
}

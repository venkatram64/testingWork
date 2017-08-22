package com.venkat.testing.service.api;

import com.venkat.testing.service.ITodoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Venkatram on 7/10/2016.
 */
//wonderlist will have todos
//this is System Under Test(SUT)
public class TodoBusinessService {

    private ITodoService todoService;

    public TodoBusinessService(ITodoService todoService){
        this.todoService = todoService;
    }

    public List<String> getTodosByUser(String user){
        List<String> filteredTodoList = new ArrayList<>();
        List<String> todoList = this.todoService.getTodosByUser(user);
        for(String todo : todoList){
            if(todo.contains("Java")){
                filteredTodoList.add(todo);
            }
        }
        return filteredTodoList;
    }

    public void deleteTodosNotRelatedToSpring(String user) {
        List<String> allTodos = todoService.getTodosByUser(user);
        for (String todo : allTodos) {
            if (!todo.contains("Java")) {
                todoService.deleteTodo(todo);
            }
        }
    }
}

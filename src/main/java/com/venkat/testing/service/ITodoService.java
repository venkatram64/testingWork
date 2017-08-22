package com.venkat.testing.service;

import java.util.List;

/**
 * Created by Venkatram on 7/10/2016.
 */
public interface ITodoService {
    public List<String> getTodosByUser(String user);
    public void deleteTodo(String todo);
}

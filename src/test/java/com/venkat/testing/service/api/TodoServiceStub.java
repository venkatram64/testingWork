package com.venkat.testing.service.api;

import com.venkat.testing.service.ITodoService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Venkatram on 7/10/2016.
 */
public class TodoServiceStub implements ITodoService {
    @Override
    public List<String> getTodosByUser(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Lean Core Java", "Learn Enterprise Java");
    }
}

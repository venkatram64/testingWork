package com.venkat.testing.service.api;

import com.venkat.testing.service.ITodoService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by Venkatram on 7/10/2016.
 */
public class TodoServiceStubTest {

    ITodoService todoService;
    TodoBusinessService todoBusinessService;

    @Before
    public void setup(){
        todoService = new TodoServiceStub();
        todoBusinessService = new TodoBusinessService(todoService);
    }

    @Test
    public void testGetTodosByUser_usingStub(){
        List<String> filteredTodos = todoBusinessService.getTodosByUser("dummy");
        assertEquals(2, filteredTodos.size());
    }
}

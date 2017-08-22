package com.venkat.testing.service.api;

import com.venkat.testing.service.ITodoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Venkatram on 7/10/2016.
 */

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceMockAnnotationTest {

    @Mock
    private ITodoService todoService;
    @InjectMocks
    private TodoBusinessService todoBusinessService;

    @Before
    public void setup(){

    }

    @Test
    public void testGetTodosByUser_usingMock(){
        List<String> todosList = Arrays.asList("Learn Spring MVC", "Learn Spring", "Lean Core Java", "Learn Enterprise Java");
        when(todoService.getTodosByUser("dummy")).thenReturn(todosList);
        //todoBusinessService = new TodoBusinessService(todoService);
        List<String> filteredTodos = todoBusinessService.getTodosByUser("dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testGetTodosByUser_usingMockWithEmpty(){
        List<String> todosList = new ArrayList<>();
        when(todoService.getTodosByUser("dummy")).thenReturn(todosList);
        todoBusinessService = new TodoBusinessService(todoService);
        List<String> filteredTodos = todoBusinessService.getTodosByUser("dummy");
        assertEquals(0, filteredTodos.size());
    }


}

package com.venkat.testing.service.api;

import com.venkat.testing.service.ITodoService;
import org.junit.Before;
import org.junit.Test;

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
public class TodoServiceMockTest {

    ITodoService todoService;
    TodoBusinessService todoBusinessService;

    @Before
    public void setup(){
        todoService = mock(ITodoService.class);
    }

    @Test
    public void testGetTodosByUser_usingMock(){
        List<String> todosList = Arrays.asList("Learn Spring MVC", "Learn Spring", "Lean Core Java", "Learn Enterprise Java");
        when(todoService.getTodosByUser("dummy")).thenReturn(todosList);
        todoBusinessService = new TodoBusinessService(todoService);
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

    @Test
    public void testListSize(){
        List<String> listStr = mock(List.class);
        when(listStr.size()).thenReturn(2).thenReturn(4);
        assertEquals(2, listStr.size());
        assertEquals(4, listStr.size());
    }

    @Test
    public void testListGet(){
        List<String> listStr = mock(List.class);
        when(listStr.get(0)).thenReturn("Java");
        assertEquals("Java", listStr.get(0));
    }

    @Test
    public void testListGetOfAny(){
        List<String> listStr = mock(List.class);
        when(listStr.get(anyInt())).thenReturn("Java");
        assertEquals("Java", listStr.get(0));
        assertEquals("Java", listStr.get(2));
    }

    @Test(expected = RuntimeException.class)
    public void testListThrowException(){
        List<String> listStr = mock(List.class);
        when(listStr.get(anyInt())).thenThrow(new RuntimeException("runtime exception is thrown"));
        listStr.get(9);
    }
}

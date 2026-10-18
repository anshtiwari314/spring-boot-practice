package com.example.firstproject.Todo;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodosService(){
       return todoRepository.getAllTodos();
    }
    public void addTodoService(Todo todo){
        todoRepository.saveTodo(todo);
    }

    public void updateTodoService(Long id,Todo todo){
        Optional<Todo> todoBox = todoRepository.findTodoById(id);
        if(todoBox.isPresent()){
            Todo oldTodo = todoBox.get();
            //System.out.println(todo.getTaskContent()+" "+todo.getTaskDesc()+" "+todo.getCompletionStatus());
            //System.out.println(oldTodo.getTaskContent()+" "+oldTodo.getTaskDesc()+" "+oldTodo.getCompletionStatus());
            oldTodo.setTaskContent(todo.getTaskContent());
            oldTodo.setTaskDesc(todo.getTaskDesc());
            oldTodo.setCompletionStatus(todo.getCompletionStatus());
            todoRepository.updateTodo(oldTodo);
        }
    }

    public void deleteTodoService(Long id){
        todoRepository.deleteTodo(id);
    }
}

package com.example.firstproject.Todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Todo> getAllTodos(){
       TypedQuery<Todo> typedQuery = entityManager.createQuery("from Todo",Todo.class);
        return typedQuery.getResultList();
    }

    @Transactional
    public void saveTodo(Todo todo){
        System.out.println((todo.getTaskContent()));
        entityManager.persist(todo);

    }

    public Optional<Todo> findTodoById(Long id){
        Todo todo = entityManager.find(Todo.class,id);
        return Optional.of(todo);
    }

    @Transactional
    public void updateTodo(Todo todo){
        System.out.println("update todo repository");
        entityManager.merge(todo);
    }

    @Transactional
    public void deleteTodo(Long id){
        Todo todo = entityManager.find(Todo.class,id);
        if(todo != null){
            entityManager.remove(todo);
        }
    }

}

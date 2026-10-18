package com.example.firstproject.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value="/addTodo" , method= RequestMethod.POST)
    //@ResponseBody
    private String createTodo(@ModelAttribute Todo todo){

        todoService.addTodoService(todo);
        System.out.println("from controller "+todo.getTaskContent()+" "+todo.getId());
        return "redirect:/";
    }

//    @RequestMapping("")
//    public String loadForm(){
//        return "task";
//    }

    @RequestMapping(value="/updateTodo/{id}" ,  method= RequestMethod.POST)
    private String updateTodo(@PathVariable("id") Long id , @ModelAttribute Todo todo){
        System.out.println("id: "+id);
        System.out.println(todo.getTaskContent()+" "+todo.getTaskDesc()+" "+todo.getCompletionStatus());
        todoService.updateTodoService(id,todo);
        return "redirect:/";
    }

    @RequestMapping(value="/deleteTodo/{id}" , method=RequestMethod.POST)
    private String deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodoService(id);
        return "redirect:/";
    }

    @RequestMapping
    private String getAllTodo(Model model){
       List<Todo> listOfTodos = todoService.getAllTodosService();
       model.addAttribute("listOfTodos",listOfTodos);
       return "task";
    }
}

package project.todaytodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.todaytodo.todo.Todo;
import project.todaytodo.todo.TodoService;
import project.todaytodo.todo.TodoServiceImpl;

import java.util.List;

@Controller
public class TodoController {
    private final TodoService todoService = new TodoServiceImpl();


    @GetMapping("/todo/new")
    public String createForm(){
        return "todo/mainPage";
    }

    @GetMapping("/todo/group")
    public String grouppage(Model model){
        List<Todo> todos= todoService.findAllTodo();
        model.addAttribute("todos",todos);
        return "todo/mainPage";
    }
//    public String list(Model model){
//        List<Todo> todos= todoService.findAllTodo();
//        model.addAttribute("todos",todos);
//        return "todo/mainPage";
//    }


    @PostMapping("/todo/new")
    public String create(TodoForm form){
        Todo todo = new Todo();
        todo.setText(form.getText());
        todo.setImportance_point(form.getImportance_point());
        todo.setPreference_point(form.getPreference_point());

        todoService.add(todo);

        return "redirect:/todo/group";
    }

    @GetMapping("/todo/delete")
    public String delete(int id){
        Long Lid=Long.valueOf(id);
        Todo todo = todoService.findTodo(Lid);
        todoService.delete(todo);
        return "redirect:/todo/group";
    }



}

package project.todaytodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

/*
    @GetMapping("/todo/{sortingway}")
    public String SortingPage(@RequestParam(required = false,defaultValue = "sortbyId") String sortingway,Model model){
        List<Todo> sortTodo = todoService.findAllTodo();
        if(sortingway.equals("sortbyId")){
            sortTodo.sort(new Comparator<Todo>() {
                @Override
                public int compare(Todo o1, Todo o2) {
                    return Long.compare(o1.getId(),o2.getId()) == 1?-1:Long.compare(o1.getId(),o2.getId())==0?0:1;
                }
            });
        }else if(sortingway.equals("sortbyPre")){
            sortTodo.sort(new Comparator<Todo>() {
                @Override
                public int compare(Todo o1, Todo o2) {
                    return Integer.compare(o1.getPreference_point(),o2.getPreference_point())==1?-1:Integer.compare(o1.getPreference_point(),o2.getPreference_point());
                }
            });
        }else if(sortingway.equals("sortbyImp")){
            sortTodo.sort(new Comparator<Todo>() {
                @Override
                public int compare(Todo o1, Todo o2) {
                    return Integer.compare(o1.getImportance_point(),o2.getImportance_point())==1?-1:Integer.compare(o1.getImportance_point(),o2.getImportance_point());
                }
            });
        }
        model.addAttribute("todos",sortTodo);
        return "todo/mainPage";
    }
*/
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
/*
    @PostMapping("/todo/sorting")
    public String sorting(Model model){
        List<SortingWay> sortingWays=new ArrayList<>();
        sortingWays.add(new SortingWay("sortbyId","기본"));
        sortingWays.add(new SortingWay("sortbyImp", "우선도"));
        sortingWays.add(new SortingWay("sortbyPre","선호도"));
        /*String howtosort=null;
        List<Todo> sortingTodo = new ArrayList<>();
        if(howtosort.equals("sortbyId")){
            sortingTodo=todoService.findAllTodo(Sort.by(Sort.Direction.ASC),"id");
        }else if(howtosort.equals("sortbyImp")){
            sortingTodo=todoService.findAllTodo(Sort.by(Sort.Direction.ASC),"importance_pt");
        }else if(howtosort.equals("sortbyPre")){
            sortingTodo=todoService.findAllTodo(Sort.by(Sort.Direction.ASC),"preference_pt");
        }

        model.addAttribute("sortingway",sortingWays);
        return "redirect:/todo/group";
    }*/


}

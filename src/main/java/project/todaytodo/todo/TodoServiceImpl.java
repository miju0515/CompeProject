package project.todaytodo.todo;

import org.springframework.data.domain.Sort;

import java.util.List;

public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository = new MemoryTodoRepository();

    public void add(Todo todo){
        todoRepository.save(todo);
    }

    public void delete(Todo todo){
        todoRepository.remove(todo);
    }
    public Todo findTodo(Long todoId){
        return todoRepository.findById(todoId);
    }


    public List findAllTodo(){
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> findAllTodo(Sort by, String id) {
        return null;
    }


}

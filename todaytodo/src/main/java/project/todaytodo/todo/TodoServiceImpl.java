package project.todaytodo.todo;

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






}

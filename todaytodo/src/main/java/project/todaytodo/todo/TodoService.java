package project.todaytodo.todo;

public interface TodoService {
    void add(Todo todo);
    void delete(Todo todo);
    Todo findTodo(Long todoId);
}

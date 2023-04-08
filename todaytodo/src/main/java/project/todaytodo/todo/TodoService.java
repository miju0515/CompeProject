package project.todaytodo.todo;

public interface TodoService {
    void add(Todo todo);

    Todo findTodo(Long todoId);
}

package project.todaytodo.todo;

import java.util.List;

public interface TodoService {
    void add(Todo todo);
    void delete(Todo todo);
    Todo findTodo(Long todoId);
    List findAllTodo();
}

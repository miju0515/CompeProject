package project.todaytodo.todo;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface TodoService {
    void add(Todo todo);
    void delete(Todo todo);
    Todo findTodo(Long todoId);
    List findAllTodo();

    List<Todo> findAllTodo(Sort by, String id);
}

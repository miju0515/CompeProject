package project.todaytodo.todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    Todo save(Todo todo);
    void remove(Todo todo);
    Todo findById(Long id);
    List<Todo> findAll();
}

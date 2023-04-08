package project.todaytodo.todo;

import java.util.*;

public class MemoryTodoRepository implements TodoRepository {

    private static Map<Long,Todo> store=new HashMap<>();
    private static long sequence = 0L;

    public Todo save(Todo todo){
        todo.setId(++sequence);
        store.put(todo.getId(),todo);
        return todo;
    }

    public Todo findById(Long todoId){
        return store.get(todoId);
    }

    public List<Todo> findAll(){
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}

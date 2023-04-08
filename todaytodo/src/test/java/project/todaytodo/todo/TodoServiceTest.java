package project.todaytodo.todo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoServiceTest {
    TodoService todoService=new TodoServiceImpl();

    @Test
    void add(){
        Todo todo = new Todo(1L,"hello-world",3,3,false);

        todoService.add(todo);
        Todo findTodo = todoService.findTodo(1L);

        Assertions.assertThat(todo).isEqualTo(findTodo);
    }
}

package project.todaytodo.todo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodoServiceTest {
    TodoService todoService=new TodoServiceImpl();

    @Test
    void add(){
        Todo todo = new Todo(1L,"hello-world",3,3,false);

        todoService.add(todo);
        Todo findTodo = todoService.findTodo(1L);

        Assertions.assertThat(todo).isEqualTo(findTodo);
    }

    @Test
    void delete(){
        Todo todo = new Todo(1L,"hello",3,3,false);
        Todo todo2 = new Todo(2L,"world",2,1,false);

        todoService.add(todo);
        todoService.add(todo2);
        todoService.delete(todo);

        List allTodo = todoService.findAllTodo();
        Assertions.assertThat(2).isEqualTo(allTodo.size());
    }

}

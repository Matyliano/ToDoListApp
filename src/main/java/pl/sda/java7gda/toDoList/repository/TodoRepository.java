package pl.sda.java7gda.toDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.java7gda.toDoList.model.TodoTask;

@Repository
public interface TodoRepository extends JpaRepository<TodoTask, Long> {


}

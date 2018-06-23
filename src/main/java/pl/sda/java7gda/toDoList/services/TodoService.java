package pl.sda.java7gda.toDoList.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.java7gda.toDoList.model.TodoTask;
import pl.sda.java7gda.toDoList.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public TodoTask create(TodoTask todoTask){
        return todoRepository.save( todoTask );
    }

}

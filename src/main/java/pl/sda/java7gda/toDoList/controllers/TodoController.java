package pl.sda.java7gda.toDoList.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.java7gda.toDoList.model.TodoTask;
import pl.sda.java7gda.toDoList.repository.TodoRepository;
import pl.sda.java7gda.toDoList.services.TodoService;

import java.util.List;

@RestController
@RequestMapping
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private TodoRepository todoRepository;


    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<TodoTask> test() {
        return ResponseEntity.ok(new TodoTask());

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoTask create(@RequestBody TodoTask todoTask) {
        return todoService.create(todoTask);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TodoTask> list() {
        return todoRepository.findAll();
    }
}

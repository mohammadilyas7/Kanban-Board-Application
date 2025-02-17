package com.task.controller;

import com.task.model.Task;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/taskService")
//@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    @Autowired
    TaskService taskServicel;

    @PostMapping("/savetask/{spaceName}/{email}")
    public ResponseEntity<?> saveTask(@RequestBody Task task,@PathVariable String spaceName,@PathVariable String email){
        System.out.println(task);
        return new ResponseEntity<>(taskServicel.saveTask(task,spaceName,email), HttpStatus.OK);
    }
//    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateTask/{spaceName}/{email}")
    public ResponseEntity<?> updateTask(@RequestBody Task task, @PathVariable String email, @PathVariable String spaceName){
        System.out.println("inside the update method");
        System.out.println(task);
        return new ResponseEntity<Task>(taskServicel.updateTask(task, spaceName, email),HttpStatus.CREATED);
    }

    @DeleteMapping("/deletetask/{email}/{id}")
    public ResponseEntity<?> deleteTaskById(@PathVariable String email,@PathVariable String id){
        System.out.println("******** inside the deleteTAsk ****** ");
        return new ResponseEntity<>(taskServicel.deleteTask(email,id),HttpStatus.OK);
    }

    @GetMapping("/gettask/{spaceName}/{email}")
    public ResponseEntity<?> getTask(@PathVariable String spaceName,@PathVariable String email){
        return new ResponseEntity<>(taskServicel.getTask(spaceName,email),HttpStatus.OK);
    }

    //Display All User
    @GetMapping("/getAllUSer")
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(taskServicel.getAllUser(),HttpStatus.OK);
    }
}
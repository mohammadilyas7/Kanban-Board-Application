package com.task.controller;

import com.task.model.Space;
import com.task.model.Task;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/taskService")
@CrossOrigin

public class TaskController {

    @Autowired
    TaskService taskServicel;

    @PostMapping("/savetask/{spaceName}/{email}")
    public ResponseEntity<?> saveTask(@RequestBody Task task,@PathVariable String spaceName,@PathVariable String email){
        System.out.println(task);
        return new ResponseEntity<>(taskServicel.saveTask(task,spaceName,email), HttpStatus.OK);
    }

    @PutMapping("/updateTask/{email}")
    public ResponseEntity<?> updateTask(@RequestBody Task task, @PathVariable String email){
        System.out.println("inside the update method");
        System.out.println(task);
        return new ResponseEntity<Task>(taskServicel.updateTask(task,email),HttpStatus.CREATED);
    }

    @DeleteMapping("/deletetask/{email}/{id}")
    public ResponseEntity<?> deleteTaskById(@PathVariable String email,@PathVariable String id){
        System.out.println("******** inside the deleteTAsk ****** ");
        return new ResponseEntity<>(taskServicel.deleteTask(email,id),HttpStatus.OK);
    }

    //get user task
    @GetMapping("/gettask/{email}/{taskName}")
    public ResponseEntity<?> getTask(@PathVariable String email,@PathVariable String taskName){
        return new ResponseEntity<>(taskServicel.getTask(email,taskName),HttpStatus.OK);
    }

    //Display All User
    @GetMapping("/getAllUSer")
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(taskServicel.getAllUser(),HttpStatus.OK);
    }




//    Task Status
    @PostMapping("/savetoBeDone/{toBeDone}/{email}")
    public ResponseEntity<?> savetoBeDone(@PathVariable String toBeDone,@PathVariable String email){
        return new ResponseEntity<>(taskServicel.savetoBeDone(toBeDone,email), HttpStatus.CREATED);
    }





}
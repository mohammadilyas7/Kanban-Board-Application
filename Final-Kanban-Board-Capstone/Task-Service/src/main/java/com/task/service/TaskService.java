package com.task.service;

import com.task.model.Space;
import com.task.model.Task;
import com.task.model.TaskStatus;
import com.task.repository.SpaceRepository;
import com.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    SpaceRepository spaceRepository;
    public Space saveTask(Task task,String spaceName,String email) {
        System.out.println("*** task service *********  ");
        Space space = spaceRepository.findBySpaceNameAndEmail(spaceName,email);
        System.out.println("*** spaceRepository.findBySpaceNameAndEmail(spaceName,email) ***");
        System.out.println(space);

        List<String> emailList = space.getEmail();
        emailList.forEach(i-> System.out.println(i));
        System.out.println(task.getEmail());

        if (space.getSpaceName().equals(spaceName)){
            System.out.println("==== space.getSpaceName().equals(spaceName) ====");
            if (space.getTaskList() == null){
                space.setTaskList(Arrays.asList(task));
                System.out.println(space);
                return spaceRepository.save(space);
            }else {
                System.out.println("======  else condisence=======");
                List list = space.getTaskList();
                list.add(task);

                space.setTaskList(list);
                return spaceRepository.save(space);
            }
        }
        return space;
    }
    public Task updateTask(Task task,String email) {
        System.out.println("update method service");
        Space space = spaceRepository.findByEmail(email);
        if (space.getEmail().equals(email)){
            List<Task> list = space.getTaskList();
            for (int i=0; i<list.size(); i++){
                if (list.get(i).getTaskId().equals(task.getTaskId())){
                    list.set(i,task);
                    space.setTaskList(list);
                    System.out.println("***  space.setTaskList(list) ***");
                    list.stream().forEach(n-> System.out.println(n));
                    spaceRepository.save(space);
                }
            }
        }
        return task;
    }
    public Space deleteTask(String email, String id) {
       Space space = spaceRepository.findByEmail(email);
        System.out.println("delete taske method service");
       List<Task> taskList = space.getTaskList();
       Task task = taskRepository.findByEmail(email);

       List<Task> list = space.getTaskList();

        if (space.getEmail().equals(email)){
            for (Task movie : taskList){
                if (movie.getTaskId().equals(id)){
                    System.out.println("//////**** delete taske method service  ****///////");
                    space.getTaskList().remove(movie);
                    System.out.println("movie temporary vareiable "+movie);
                    return spaceRepository.save(space);
                }
            }
        }
        return space;
    }

    public List<Space> getAllUser() {
        List<Space> list = spaceRepository.findAll();
        list.stream().forEach(i-> System.out.println(i));
        return (List<Space>) spaceRepository.findAll();
    }

    public Optional<Task> getTask(String email, String taskName) {
        Task task = taskRepository.findByEmail(email);
//        String id = task.getTaskId();
        if (task != null){
            if (task.getEmail().equals(email)){
                if (task.getTaskName().equals(taskName)){
                    return taskRepository.findById(task.getTaskId());
                }
            }
        }
        return null;
    }

    public Space savetoBeDone(String toBeDone,String email) {
        Space space = spaceRepository.findByEmail(email);
        System.out.println(space.getEmail()+" spaceRepository.findByEmail(email); ");
        List<Task> taskList = space.getTaskList();
        TaskStatus taskStatus= new TaskStatus();

        if (space.getEmail().equals(email)){
            for (Task task:taskList){
                if (task.getEmail().equals(email)){
                    if (task.getTaskStatusList() == null){
                        taskStatus.setToBeDone(Collections.singletonList(toBeDone));
                        task.setTaskStatusList(Arrays.asList(taskStatus));
                        List list = space.getTaskList();
                        list.add(task);
                        space.setTaskList(list);
                        System.out.println("line 109");
                        System.out.println(space);
                        return spaceRepository.save(space);
                    }else {
                        List list1 = task.getTaskStatusList();
                        taskStatus.setToBeDone(Collections.singletonList(toBeDone));
                        list1.add(taskStatus);

                        List list = space.getTaskList();
                        list.add(list1);
                        space.setTaskList(list);
                        System.out.println("line 119 ");
                        System.out.println(space);
                        return spaceRepository.save(space);
                    }
                }
            }
        }
        return space;
    }



}
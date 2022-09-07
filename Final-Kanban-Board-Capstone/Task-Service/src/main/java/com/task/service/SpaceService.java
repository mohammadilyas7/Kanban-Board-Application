package com.task.service;

import com.task.exception.SpaceNotFoundException;
import com.task.model.Space;
import com.task.repository.SpaceRepository;
import com.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SpaceService {
    @Autowired
    SpaceRepository spaceRepository;
    @Autowired
    TaskRepository taskRepository;

    //=================    working =====================
    public Space createSpace(Space space,String email) throws SpaceNotFoundException{
        Space space1 = new Space();

        space1.setSpaceName(space.getSpaceName());
        space1.setEmail(Collections.singletonList(email));      //converting the string to list
        space1.setTaskList(null);
        return  spaceRepository.save(space1);
    }
    public Space addEmailToSpace(String spaceName, String email) {
        Space space = spaceRepository.findBySpaceName(spaceName);
        if (space.getSpaceName().equals(spaceName)){
            List list = space.getEmail();
            list.add(email);
            space.setEmail(list);       //converting the string to list
            spaceRepository.save(space);
        }

        return space;
    }

    //=================    working =====================
    public List<Space> getSpaceLoginUser(String email) throws SpaceNotFoundException{
        List<Space> list=new ArrayList<>();
        List<Space> spaces=spaceRepository.findAll();
        for(Space s:spaces)
        {
            if(s.getEmail().contains(email))
            {
                list.add(s);
            }
        }
        return list;
    }

    //=================    working =====================
    public List<Space> getAllSpace() {
        return spaceRepository.findAll();
    }

    //=================    working =====================
    public String deleteByIdAndEmail(String email, String spaceName) throws SpaceNotFoundException {
        Space space = spaceRepository.findBySpaceNameAndEmail(spaceName,email);
        System.out.println("***** space *****");
        System.out.println(space);
        if (space.getSpaceName() != null){
            System.out.println("inside the if cindition");
            System.out.println(space.getSpaceName());
            if (space.getSpaceName().equals(spaceName)){
                System.out.println("******** deleteByIdAndEmail *********");
                spaceRepository.delete(space);
                return "Space Deleted Successfully";
            }
        }
        return null;
    }

    public Space updateSpaceName(String email, String spaceName) {
        return null;
    }

    //genrate the spaceId
    public static long genratedSpaceId(Space space){
        long min = 111111111111l;
        long max = 999999999999l;
        long id =(long) (Math.random()*(max-min)+min);
        System.out.println("\ngenerate the Id : "+id);
        return id;
    }


//|| (list.get(i).getSpaceName().equalsIgnoreCase(space.getSpaceName()) && list.get(i).getSpaceId().equals(space.getSpaceId()) )
}
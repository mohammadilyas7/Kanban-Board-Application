package com.task.controller;

import com.task.exception.SpaceNotFoundException;
import com.task.model.Space;
import com.task.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/space")
public class SpaceController {

    @Autowired
    SpaceService spaceService;

    @PostMapping("/createspace/{email}")
    public ResponseEntity<?> createSpace(@RequestBody Space space,@PathVariable String email) throws SpaceNotFoundException{
        System.out.println("inside create Space method");
        return new ResponseEntity<>(spaceService.createSpace(space,email), HttpStatus.CREATED);
    }

    @PostMapping("/addEmailToSpace/{spaceName}/{email}")
    public ResponseEntity<?> addEmailToSpace(@PathVariable String spaceName,@PathVariable String email){
        return new ResponseEntity<>(spaceService.addEmailToSpace(spaceName,email),HttpStatus.OK);
    }

    @GetMapping("/getSpaceLoginUser/{email}")
    public ResponseEntity<?> getSpaceLoginUser(@PathVariable String email) throws SpaceNotFoundException{
        return new ResponseEntity<>(spaceService.getSpaceLoginUser(email),HttpStatus.OK);
    }

    @GetMapping("/getAllSpace")
    public ResponseEntity<List<Space>> getAllSpace(){
        return new ResponseEntity<List<Space>>(spaceService.getAllSpace(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{email}/{spaceName}")
    public ResponseEntity<String> deleteByIdAndEmail(@PathVariable String email,@PathVariable String spaceName) throws SpaceNotFoundException {
        System.out.println(" inside deleteByIdAndEmail");
        return new ResponseEntity<>(spaceService.deleteByIdAndEmail(email,spaceName),HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<?> updateSpaceName(@PathVariable String email,@PathVariable String spaceName ){
        return new ResponseEntity<>(spaceService.updateSpaceName(email,spaceName),HttpStatus.CREATED);
    }





}
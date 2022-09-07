package com.task.model;

import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TaskStatus {
    private List<String> toBeDone;
    private List<String> inProgress;
    private List<String> completed;
//    private List<String>  emailList;
}
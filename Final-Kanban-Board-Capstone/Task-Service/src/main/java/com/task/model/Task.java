package com.task.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Task {
    @Id
    private String taskId;
    private String email;
    private String taskName;
    private String priority;
    private String taskDescription;
    private Date startDate;
    private Date dueDate;

    private List<TaskStatus> taskStatusList;
 }
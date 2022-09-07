package com.task.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Notification {
    @Id
    private int notificationId;
    private String notificationName;
}
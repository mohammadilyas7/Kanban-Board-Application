package com.notification.controller;

import com.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Notification")
@CrossOrigin (origins = "http://localhost:4200")

public class NotificationController {
    @Autowired
    NotificationService notificationService;
}
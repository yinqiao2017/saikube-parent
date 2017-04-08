package com.skb.notification.controller;

import com.skb.notification.domain.Notification;
import com.skb.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@RestController
@RequestMapping({"/notification"})
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<Notification> selectAllNotifications(){
        List<Notification> notifications = notificationService.selectAllNotifications();
        return notifications;
    }
}

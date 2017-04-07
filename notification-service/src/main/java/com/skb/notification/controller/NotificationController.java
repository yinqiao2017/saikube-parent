package com.skb.notification.controller;

import com.skb.notification.domain.Notification;
import com.skb.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@Controller
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    public List<Notification> selectAllNotifications(){
        List<Notification> notifications = notificationService.selectAllNotifications();
        return notifications;
    }
}

package com.skb.notification.service;

import com.skb.notification.dao.NotificationMapper;
import com.skb.notification.domain.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@Service
public class NotificationService {
    @Autowired
    NotificationMapper notificationMapper;

    public List<Notification> selectAllNotifications(){
        List<Notification> notifications = notificationMapper.selectAllNotifications();
        return notifications;
    }
}

package com.skb.notification.dao;

import com.skb.notification.domain.Notification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@Mapper
public interface NotificationMapper {



    void insertNotification(Notification notification);

    Notification selectNotificationById(Long id);

    void deleteNotificationById(Long id);

    void updateNotification(Notification notification);

    List<Notification> selectAllNotifications();

}

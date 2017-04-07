package com.skb.notification.push;


import com.skb.notification.dao.NotificationMapper;
import com.skb.notification.push.android.AndroidUnicast;
import org.springframework.beans.factory.annotation.Autowired;

public class App {
    private String appkey = null;
    private String appMasterSecret = null;
    private String timestamp = null;
    private String message = null;
    private PushClient client = new PushClient();

    @Autowired
    NotificationMapper notificationMapper;

    public App(String key, String secret) {
        try {
            appkey = key;
            appMasterSecret = secret;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void sendAndroidUnicast() throws Exception {
        AndroidUnicast unicast = new AndroidUnicast(appkey,appMasterSecret);

        message = notificationMapper.selectNotificationById(1L).getMessage();

        // TODO Set your device token
        unicast.setDeviceToken( "your device token");
        unicast.setTicker( "Android unicast ticker");
        unicast.setTitle(  "中文的title");
        unicast.setText(   message);
        unicast.goAppAfterOpen();
        unicast.setDisplayType(AndroidNotification.DisplayType.NOTIFICATION);
        // TODO Set 'production_mode' to 'false' if it's a test device.
        // For how to register a test device, please see the developer doc.
        unicast.setProductionMode(false);
        // Set customized fields
        unicast.setExtraField("test", "helloworld");
        client.send(unicast);
    }

    public static void main(String[] args) {
        // TODO set your appkey and master secret here
        Demo demo = new Demo("58e5d7dc310c933b8a000a7d", "suz9satatjqqs3gl1u7hc9gstdzsfxlh");
        try {
            demo.sendAndroidUnicast();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

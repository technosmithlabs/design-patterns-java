package com.technosmithlabs.dp.structural.proxy;

public class PushNotificationImpl implements PushNotification {

    @Override
    public void pushNotification(String msg) {
        System.out.println("Your message is pushed: " + msg);
    }
}

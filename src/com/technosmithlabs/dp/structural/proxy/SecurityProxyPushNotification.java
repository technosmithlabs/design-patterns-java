package com.technosmithlabs.dp.structural.proxy;

import java.util.Objects;

public class SecurityProxyPushNotification implements PushNotification {

    private String userName;

    private PushNotification pushNotification;

    public SecurityProxyPushNotification(String userName) {
        this.userName = userName;
    }

    private Boolean isUserValid(String userName) {
        if (userName.startsWith("A")) {
            System.out.println("This user is valid: " + userName);
            return true;
        }
        return false;
    }

    @Override
    public void pushNotification(String msg) {
        if (isUserValid(this.userName)) {
            if (Objects.isNull(this.pushNotification)) {
                this.pushNotification = new PushNotificationImpl();
            }
            this.pushNotification.pushNotification(msg);
        } else {
            System.out.println("The user is not valid. Push Notification failed for user: " + this.userName);
        }
    }
}

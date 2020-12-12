package com.technosmithlabs.dp.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String args[]) {
        PushNotification pushNotification = new SecurityProxyPushNotification("Anshul");
        pushNotification.pushNotification("Hello World");
        PushNotification pushNotificationAnother = new SecurityProxyPushNotification("Gautam");
        pushNotificationAnother.pushNotification("Hello World");
    }
}

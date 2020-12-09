package com.technosmithlabs.dp.creational.singleton;

public class Runner {
    public static void main(String args[]) {
        // the below code is not valid as we have a private constructor present in the
        // SingletonDemo class.
        //SingletonDemo instance = new SingletonDemo();
        SingletonDemo instance = SingletonDemo.getInstance();
        SingletonDemo instanceAnother = SingletonDemo.getInstance();
        System.out.println(instance==instanceAnother);
    }
}

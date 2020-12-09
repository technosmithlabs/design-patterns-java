package com.technosmithlabs.dp.creational.singleton;

import java.util.Objects;

public class SingletonDemo {

    private static volatile SingletonDemo threadSafeInstance = null;

    private static SingletonDemo instance = null;

    private SingletonDemo() {
        // the below code has been added to ensure that Runtime reflection is not used
        // to create the object of this class.
        if (Objects.nonNull(instance) && Objects.nonNull(threadSafeInstance)) {
            throw new RuntimeException("Please use getInstance() method to get the " +
                    "object of this class");
        }
    }

    public static SingletonDemo getInstance() {
        // the below if check ensures that we are lazily creating the instance.
        if (Objects.isNull(instance)) {
            instance = new SingletonDemo();
            return instance;
        }
        return instance;
    }

    public static SingletonDemo getThreadSafeInstance() {
        // the below if check ensures that we are lazily creating the instance.
        if (Objects.isNull(threadSafeInstance)) {
            // below code has been added to ensure that when multiple threads try
            // to create the instance, we are not allowing that to happen.
            // Object instantiation will happen in isolation for a single thread only
            // and then, the created instance will be used by rest of the threads.
            synchronized (SingletonDemo.class) {
                if (Objects.isNull(threadSafeInstance)) {
                    threadSafeInstance = new SingletonDemo();
                    return threadSafeInstance;
                }
            }
        }
        return threadSafeInstance;
    }
}

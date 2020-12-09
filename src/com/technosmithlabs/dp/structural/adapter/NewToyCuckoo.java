package com.technosmithlabs.dp.structural.adapter;

public class NewToyCuckoo implements BirdAdaptor {
    @Override
    public void makeSound() {
        System.out.println("The NewToyCuckoo is making sound");
    }
}

package com.technosmithlabs.dp.structural.adapter;

public class Duck implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Duck is making sound");
    }
}

package com.technosmithlabs.dp.structural.adapter;

public class AdaptorDemo {
    public static void main(String argsp[]) {
        Bird duck = new Duck();
        Bird parrot = new Parrot();
        Bird cuckoo = new NewToyCuckoo();
        duck.makeSound();
        parrot.makeSound();
        cuckoo.makeSound();
    }
}

package com.technosmithlabs.dp.structural.decorator;

public class FileReader implements Reader {
    @Override
    public void read() {
        System.out.println("I am FileReader and now I am reading the file");
    }
}

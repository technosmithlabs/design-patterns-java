package com.technosmithlabs.dp.structural.decorator;

public class DecoratorDemo {
    public static void main(String args[]) {
        System.out.println("Reading from existing FileReader starts");
        Reader fileReader = new FileReader();
        fileReader.read();
        System.out.println("Reading from existing FileReader ends");

        System.out.println("Reading from new DecompressFileReader starts");
        Reader decompressedReader = new DecompressFileReader(new FileReader());
        decompressedReader.read();
        System.out.println("Reading from new DecompressFileReader ends");
    }
}

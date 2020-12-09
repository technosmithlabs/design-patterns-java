package com.technosmithlabs.dp.creational.prototype;

public class PrototypeDemo {
    public static void main(String args[]) {
        Movie movie = (Movie) Registry.createItem("movie");
        movie.setName("Baadshah");
        Movie anotherMovie = (Movie) Registry.createItem("movie");
        movie.setName("Yes Boss");
        // below sysos will print two different hashcodes which confirms that both
        // objects are unique. And these objects were created without making use of new
        // keyword.
        System.out.println("The first movie is: " + movie);
        System.out.println("The first movie is: " + anotherMovie);
    }
}

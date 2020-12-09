package com.technosmithlabs.dp.creational.builder;

public class Runner {
    public static void main(String args[]) {
        BuilderDemo.Builder builder = new BuilderDemo.Builder();
        BuilderDemo demoObject =
                builder.breadType("Oregano").dressing("Lettuce").ketchup("Tomato").egg(true).meat(false).build();
        System.out.println(demoObject);
    }
}

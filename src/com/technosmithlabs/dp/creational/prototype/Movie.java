package com.technosmithlabs.dp.creational.prototype;

public class Movie extends Item {

    private String name;
    private long runtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }
}

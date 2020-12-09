package com.technosmithlabs.dp.creational.builder;

public class BuilderDemo {

    private String breadType;
    private String dressing;
    private String ketchup;
    private Boolean egg;
    private Boolean meat;

    // private constructor provides immutability
    private BuilderDemo(Builder builder) {
        this.breadType = builder.breadType;
        this.dressing = builder.dressing;
        this.ketchup = builder.ketchup;
        this.egg = builder.egg;
        this.meat = builder.meat;
    }

    // in this static inner class, default constructor is used to create builder object.
    public static class Builder {
        private String breadType;
        private String dressing;
        private String ketchup;
        private Boolean egg;
        private Boolean meat;

        public Builder breadType(String breadType) {
            this.breadType = breadType;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder ketchup(String ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Builder egg(Boolean egg) {
            this.egg = egg;
            return this;
        }

        public Builder meat(Boolean meat) {
            this.meat = meat;
            return this;
        }

        public BuilderDemo build() {
            return new BuilderDemo(this);
        }
    }

    @Override
    public String toString() {
        return "BuilderDemo{" +
                "breadType='" + breadType + '\'' +
                ", dressing='" + dressing + '\'' +
                ", ketchup='" + ketchup + '\'' +
                ", egg=" + egg +
                ", meat=" + meat +
                '}';
    }
}

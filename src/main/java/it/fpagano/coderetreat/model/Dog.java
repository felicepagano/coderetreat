package it.fpagano.coderetreat.model;

public class Dog extends Animal {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

package it.fpagano.coderetreat.model;

public abstract class Animal {
    public abstract String getName();

    @Override
    public String toString() {
        return "Cat{" + "name='" + getName() + '\'' + '}';
    }

}

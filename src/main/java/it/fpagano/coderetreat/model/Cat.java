package it.fpagano.coderetreat.model;

public class Cat extends Animal {

    private final String name;
    private final int stronzaggine;

    public Cat(String name, int stronzaggine) {
        this.name = name;
        this.stronzaggine = stronzaggine;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getStronzaggine() {
        return stronzaggine;
    }
}

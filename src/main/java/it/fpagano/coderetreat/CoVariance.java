package it.fpagano.coderetreat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import it.fpagano.coderetreat.model.Animal;
import it.fpagano.coderetreat.model.Cat;
import it.fpagano.coderetreat.model.Dog;

public class CoVariance<T> {

    private CoVariance() {}

    public List<T> of(T...elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        CoVariance<Dog> dogCovariance = new CoVariance<>();
        CoVariance<Cat> catCovariance = new CoVariance<>();
        Optional<? extends Animal> fuffy = dogCovariance.getFirstElement(dogCovariance.of(new Dog("fuffy")));
        Animal animal = fuffy.get();
        System.out.println(fuffy);
        System.out.println(dogCovariance.getFirstElement(catCovariance.of(new Cat("felix", 1))));


    }
    public Optional<? extends Animal> getFirstElement(List<? extends Animal> list) {
        return list.stream().findFirst();
    }
}


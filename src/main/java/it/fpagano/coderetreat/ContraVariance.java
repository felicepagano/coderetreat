package it.fpagano.coderetreat;

import it.fpagano.coderetreat.model.Animal;
import it.fpagano.coderetreat.model.Cat;

public class ContraVariance {

    public static void main(String[] args) {
        System.out.println(compareAnimals(new AnimalComparator()));
        System.out.println(compareAnimals(new CatComparator()));
    }

    public static int compareAnimals(Comparator<? super Cat> comparator) {
        Cat pippo = new Cat("pippo", 1);
        Cat pluto = new Cat("Pluto", 2);
        return comparator.compare(pippo, pluto);
    }

}

abstract class Comparator<T> {

    abstract int compare(T t1, T t2);
}

class AnimalComparator extends Comparator<Animal> {

    @Override
    int compare(Animal d1, Animal d2) {
        System.out.println("Animal comparator");
        return d1.getName().compareTo(d2.getName());
    }
}

class CatComparator extends Comparator<Cat> {

    @Override
    int compare(Cat t1, Cat t2) {
        System.out.println("Cat comparator");
        return t1.getStronzaggine() - t2.getStronzaggine();
    }
}
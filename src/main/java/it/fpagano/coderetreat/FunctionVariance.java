package it.fpagano.coderetreat;

import java.util.function.Function;

import it.fpagano.coderetreat.model.Animal;
import it.fpagano.coderetreat.model.Cat;
import it.fpagano.coderetreat.model.Vehicle;

public class FunctionVariance {

    public static void main(String[] args) {
        Function<Animal, Vehicle> f = animal -> new Vehicle() {
            @Override
            public String getType() {
                return "Generic";
            }
        };
        System.out.println(value(f));
    }

    public static String value(Function<? super Cat, ? extends Vehicle> f) {
        return f.apply(new Cat("", 1)).getType();
    }
}

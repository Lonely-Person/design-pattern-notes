package factory.abstractfactory;

import factory.simple.Banana;
import factory.simple.Fruit;

public class BananaCakeFactory implements FruitCakeFactory {
    @Override
    public Fruit produceFruit() {
        return new Banana();
    }

    @Override
    public Cake produceCake() {
        return new CakeB();
    }
}

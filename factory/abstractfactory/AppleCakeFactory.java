package factory.abstractfactory;

import factory.simple.Apple;
import factory.simple.Fruit;

public class AppleCakeFactory implements FruitCakeFactory {

    @Override
    public Fruit produceFruit() {
        return new Apple();
    }

    @Override
    public Cake produceCake() {
        return new CakeA();
    }
}

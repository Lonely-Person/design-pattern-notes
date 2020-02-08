package factory.abstractfactory;

import factory.simple.Fruit;

public interface FruitCakeFactory {
    Fruit produceFruit();

    Cake produceCake();
}

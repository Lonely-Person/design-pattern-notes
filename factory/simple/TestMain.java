package factory.simple;

public class TestMain {
    public static void main(String[] args) {
        Fruit apple = (Apple)FruitFactory01.produceFruit("apple");
        assert apple != null;
        apple.getName();
        Fruit fruit = FruitFactory04.produceFruit(Banana.class);
        assert fruit != null;
        fruit.getName();
    }
}

package factory.simple;

public class FruitFactory03 {
    public enum FruitType{
        APPLE, BANANA
    }

    public static Fruit produceFruit(FruitType type){
        switch (type){
            case APPLE:
                return new Apple();
            case BANANA:
                return new Banana();
            default:
                return null;
        }
    }
}

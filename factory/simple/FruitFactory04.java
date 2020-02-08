package factory.simple;

public class FruitFactory04 {
    public static Fruit produceFruit(Class<? extends Fruit> type){
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }
}

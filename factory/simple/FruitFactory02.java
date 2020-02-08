package factory.simple;

public class FruitFactory02 {
    public static Fruit produceFruit(String fruitName){
        //使用switch实现
        switch (fruitName){
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            default:
                return null;
        }
    }
}

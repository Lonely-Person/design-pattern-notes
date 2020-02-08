package factory.simple;

public class FruitFactory01 {
    public static Fruit produceFruit(String fruitName){
        if ("apple".equalsIgnoreCase(fruitName)){
            return new Apple();
        }else if ("banana".equalsIgnoreCase(fruitName)){
            return new Banana();
        }
        //这种实现，存在产生空指针异常的可能
        return null;
    }
}

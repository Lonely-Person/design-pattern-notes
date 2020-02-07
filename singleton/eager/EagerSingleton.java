package singleton.eager;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    //饿汉模式
    //由于在类加载之初，所以是线程安全的
    //比较常用，但容易产生垃圾
    public static EagerSingleton getInstance(){
        return instance;
    }


}

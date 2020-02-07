package singleton.lazy;

public class LazySingleton {

    //持有自己类型的属性
    private static LazySingleton instance;
    //构造器私有
    private LazySingleton(){};

    //对外提供获取实例的静态方法
    public static LazySingleton getInstance(){
        //懒汉模式
        //由于多线程的问题，所以是线程不安全的
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

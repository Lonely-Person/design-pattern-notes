package singleton.eager;

public enum  EnumSingleton {

    //默认枚举实例的创建是线程安全的，并且在任何情况下都是单例
    //实际上：1、枚举类隐藏了私有的构造器；2、枚举类的域 是相应类型的一个实例对象

    INSTANCE;

    //doSomething 该实例支持的行为

    //可以省略此方法，通过Singleton.INSTANCE进行操作
    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}

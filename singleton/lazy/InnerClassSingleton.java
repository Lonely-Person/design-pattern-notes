package singleton.lazy;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class InnerClassSingleton {
    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    //静态内部类必须是private修饰的，如果不是private的，new InnerClassSingleton.InnerClass();
    //这种使用静态内部类的方法跟类的加载机制有关
    private static class InnerClass{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}

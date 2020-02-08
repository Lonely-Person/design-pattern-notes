package singleton.lazy;



public class InnerClassSingleton {
    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    //静态内部类必须是private修饰的，如果不是private的，new InnerClassSingleton.InnerClass();
    //这种使用静态内部类的方法跟类的加载机制有关
    //静态内部类也有着一个致命的缺点，就是传参的问题
    private static class InnerClass{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}

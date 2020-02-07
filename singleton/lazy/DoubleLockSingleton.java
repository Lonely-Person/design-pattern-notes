package singleton.lazy;

public class DoubleLockSingleton {
    //volatile 相当于第二把所，其他线程执行到 #1处会从主线程重新拷贝值，如果不为空则不向下进行了
    private volatile static DoubleLockSingleton instance;
    private DoubleLockSingleton(){}
    public static DoubleLockSingleton getInstance(){
        if (instance == null){
            //这是第一把所，保证了只能有一个线程执行本代码块
            synchronized (DoubleLockSingleton.class){
                if (instance == null){ // #1
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

}

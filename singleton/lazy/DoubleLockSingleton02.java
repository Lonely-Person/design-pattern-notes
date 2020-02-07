package singleton.lazy;

public class DoubleLockSingleton02 {
    private static DoubleLockSingleton02 instance = null;
    public static DoubleLockSingleton02 getInstance() {
        //这种实现方式存疑
        //
        if (instance == null) {
            DoubleLockSingleton02 sc;
            synchronized (DoubleLockSingleton02.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (DoubleLockSingleton02.class) {
                        if(sc == null) {
                            sc = new DoubleLockSingleton02();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
    private DoubleLockSingleton02() {
    }
}

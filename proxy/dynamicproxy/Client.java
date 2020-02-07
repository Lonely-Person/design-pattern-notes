package proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        //客户访问的步骤
        //步骤1：首先创建一个被代理的对象
        LiuDeHua target = new LiuDeHua();

        //步骤2：创建一个代理人
        StarProxy proxy = new StarProxy();

        //步骤3：把被代理对象交给代理人
        proxy.setTarget(target);

        //步骤4：由代理人创建一个被增强的目标类
        Star star = (Star)proxy.createProxyedObj();

        //分析：
        //表面上看不到代理类和接口Star之间有任何联系，
        //只是代理实现了InvocationHandler，然后使用Proxy生成了一个被代理对象，
        //我的猜测是代理，通过被代理对象拿到的接口Star，最终生成了一个如下的关系
        //public final class StarProxy extends Proxy implements Star

        star.dance();
    }
}

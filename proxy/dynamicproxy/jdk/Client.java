package proxy.dynamicproxy.jdk;

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
        //代理类通过Proxy.newProxyInstance()中的第二个参数拿到的被代理类的 接口
        //public final class StarProxy extends Proxy implements Star

        star.dance();
    }
}

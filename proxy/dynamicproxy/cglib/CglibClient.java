package proxy.dynamicproxy.cglib;

import proxy.dynamicproxy.jdk.LiuDeHua;
import proxy.dynamicproxy.jdk.Star;

public class CglibClient {
    public static void main(String[] args) {
        LiuDeHua hua = new LiuDeHua();
        CglibProxy proxy = new CglibProxy();
        Star star = (Star)proxy.CreatProxyedObj(LiuDeHua.class);

        star.dance();
    }
}

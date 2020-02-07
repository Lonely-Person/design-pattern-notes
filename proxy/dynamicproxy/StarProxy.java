package proxy.dynamicproxy;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Data
public class StarProxy implements InvocationHandler {

    //步骤1：定义目标类，也就是代理对象
    private Object target;

    //步骤2：重写invoke方法，填写增强的内容
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //增强的内容
        System.out.println("我是明星的代理人，我来收钱的！");
        Object result = method.invoke(target, args);
        return result;
    }

    //步骤3：由代理人创建一个被增强的目标类
    public Object createProxyedObj(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}

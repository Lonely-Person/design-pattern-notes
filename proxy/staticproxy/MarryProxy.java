package proxy.staticproxy;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MarryProxy implements Marry {

    private Marry client = new RealMarryPerson(); //由于这里写死了代理某个类，所以说是静态代理


    @Override
    public void marry(String clientName) {
        System.out.println("准备录影，记录你最悲催的一天！");
        client.marry(clientName);
        System.out.println("送入洞房！");
    }
}

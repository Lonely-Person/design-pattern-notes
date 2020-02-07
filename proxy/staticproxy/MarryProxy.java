package proxy.staticproxy;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MarryProxy implements Marry {

    private Marry client = new RealMarryPerson();


    @Override
    public void marry(String clientName) {
        System.out.println("准备录影，记录你最悲催的一天！");
        client.marry(clientName);
        System.out.println("送入洞房！");
    }
}

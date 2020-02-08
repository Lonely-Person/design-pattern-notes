package proxy.dynamicproxy.jdk;

public class LiuDeHua implements Star {
    @Override
    public String sing() {
        System.out.println("我唱...");
        return "我唱完了";
    }

    @Override
    public String dance() {
        //
        System.out.println("我跳");
        return "我跳完了";
    }
}

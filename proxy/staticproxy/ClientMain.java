package proxy.staticproxy;

public class ClientMain {
    public static void main(String[] args) {
        Marry client = new MarryProxy();
        client.marry("高尚");
    }
}

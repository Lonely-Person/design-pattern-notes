package proxy.staticproxy;

public class RealMarryPerson implements Marry {


    @Override
    public void marry(String clientName) {
        System.out.println("恭喜->"+ clientName +"<-进入爱情的坟墓");
    }
}

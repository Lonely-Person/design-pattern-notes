package prototype;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

//@Slf4j  //加上这个注解之后直接使用log即可
public class TestMain {
    public static Log log = LogFactory.getLog(TestMain.class);
    public static void main(String[] args) {

        //创建一个演员名单
        List<String> cast = new ArrayList<>();
        cast.add("张三");
        cast.add("李四");
        //拿到演员名单并对其操作，可以看成是一个简单的利用了原型模式
        List<String> b = new ArrayList<>(cast);
        b.remove("张三");
        log.info(String.valueOf(cast));
        log.info(String.valueOf(b));
    }
}

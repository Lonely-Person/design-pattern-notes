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

        //拿到上一周的工作报表，里面包含了上周报表的数据
        var preWeek = new ReportTemplate();

        //由于本周工作内容无变化，我们就直接以上周的工作报告作为模板，直接使用
        /*原型模式使用的前提或者是场景吧：
            1、当new一个对象时，非常繁琐复杂时，可以使用原型模式来进行复制一个对象。
            2、需要提供数据对象，同时有需要避免外部对数据对象进行修改。
        */
        var thisWeek = (ReportTemplate) preWeek.clone();
        log.info(thisWeek.content);
    }
}

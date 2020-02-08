package prototype;

import lombok.Data;


@Data
public class ReportTemplate implements Cloneable{
    String header = "我是默认的报告头部";
    String tail = "我是默认的报告尾部";
    String content = "这是上一周的工作报告，如无变动可直接提交";

    @Override
    protected Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

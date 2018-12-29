package jmock;

import mockit.Expectations;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Locale;

/**
 * Created by Cui Tianqi
 * Create Date: 2018/12/29 19:06
 * Description: ${DESCRIPTION}
 */
public class HelloJmockTest {
    /**
     * 测试场景：当前是在中国
     */
    @Test
    public void testSayHelloAtChina() {

        // 假设当前位置是在中国
        new Expectations(Locale.class) {
            {
                Locale.getDefault();
                result = Locale.CHINA;
            }
        };
        // 断言说中文
        Assert.assertTrue("你好，JMockit!".equals((new HelloJmock()).sayHello()));
    }
}

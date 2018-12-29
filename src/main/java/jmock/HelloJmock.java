package jmock;

import java.util.Locale;

/**
 * Created by Cui Tianqi
 * Create Date: 2018/12/29 19:06
 * Description: ${DESCRIPTION}
 */
public class HelloJmock {

    public String sayHello() {
        Locale locale = Locale.getDefault();
        if (locale.equals(Locale.CHINA)) {
            // 在中国，就说中文
            return "你好，JMockit!";
        } else {
            // 在其它国家，就说英文
            return "Hello，JMockit!";
        }
    }
}

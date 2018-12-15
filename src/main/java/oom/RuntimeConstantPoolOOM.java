package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * descrition：
 *
 * @author: Tianqi Cui
 * @create: 2018/12/14 11:37
 * @company: www.ideabinder.com
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int i = 0;


        while (true) {
            list.add(String.valueOf(i++).intern());

        }
    }
}

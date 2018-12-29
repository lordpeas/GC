package jmock;

import com.google.common.cache.CacheBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Cui Tianqi
 * Create Date: 2018/12/29 13:36
 * Description: ${DESCRIPTION}
 */
public class Btrace {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Thread.sleep(10000);
        String tracer = tracer(bufferedReader.readLine());
    }


    public static String tracer(String value) {
        System.out.println(value);
//        Optional<String> optional = Optional.ofNullable(value);
//        String va = optional.orElseGet(() -> new String("1234444567890"));
//        System.out.println(v);
        return value;
    }
}

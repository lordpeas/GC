package gc;

/**
 * descrition：
 *
 * @author: Tianqi Cui
 * @create: 2018/12/15 18:03
 * @company: www.ideabinder.com
 */
public class GCTest {

    private static final int _1MB = 1024 * 1024;


    public static void testAllocation() {
        byte[] allocation1;
        byte[] allocation2;
        byte[] allocation3;
        byte[] allocation4;

        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}

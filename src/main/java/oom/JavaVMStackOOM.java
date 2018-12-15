package oom;

/**
 * descrition：
 *
 * @author: Tianqi Cui
 * @create: 2018/12/14 11:04
 * @company: www.ideabinder.com
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }


    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();

        javaVMStackOOM.stackLeakByThread();
    }
}

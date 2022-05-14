package org.zq.jdk.lambda;

/**
 * @description:
 * @author:zq
 * @time:7:59
 */
public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中的代码"+Thread.currentThread().getName());
            }
        }).start();
        System.out.println("主线程中的代码"+Thread.currentThread().getName());
        new Thread(()->{System.out.println("lambda表达式中的代码"+Thread.currentThread().getName());}).start();
    }
}

package org.zq.jdk.fun;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * @description:
 * @author:zq
 * @time:11:15
 */
public class ConsumerTest {
    public static void main(String[] args) {
        fun1(msg ->{
            System.out.println(msg.toLowerCase());
        });
    }

    public static void fun1(Consumer<String> consumer){
        consumer.accept("Hello World");
    }
}

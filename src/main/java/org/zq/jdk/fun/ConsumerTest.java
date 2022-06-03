package org.zq.jdk.fun;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * @description:
 * @author:zq
 * @time:7:54
 */
public class ConsumerTest {
    public static void main(String[] args) {
//        fun1(msg -> {
//            System.out.println(msg + "转化为小写：" + msg.toLowerCase(Locale.ROOT));
//        });
        fun2(c1 ->{
            System.out.println(c1 + "转换为小写：" + c1.toLowerCase(Locale.ROOT));
        },c2 ->{
            System.out.println(c2 + "转换为大写：" + c2.toUpperCase(Locale.ROOT));
        });
    }

    public static void fun1(Consumer<String> consumer){
        consumer.accept("Hello World!");
    }

    public static void fun2(Consumer<String> consumer1,Consumer<String> consumer2){
        String str = "Hello World!";
//        consumer1.andThen(consumer2).accept(str);
        consumer2.andThen(consumer1).accept(str);
    }
}

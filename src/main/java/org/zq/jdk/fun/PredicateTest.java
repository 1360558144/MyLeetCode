package org.zq.jdk.fun;

import java.util.function.Predicate;

/**
 * @description:
 * @author:zq
 * @time:8:33
 */
public class PredicateTest {
    public static void main(String[] args) {
        fun1(msg ->{
            return msg.length()>4;
        }, "Hell");

    }

    public static void fun1(Predicate<String> predicate,String msg){
        boolean test = predicate.test(msg);
        System.out.println(test);
    }
}

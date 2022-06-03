package org.zq.jdk.fun;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @description:
 * @author:zq
 * @time:9:23
 */
public class FunctionRefTEst03 {
    public static void main(String[] args) {
        Function<String,Integer> function1 = (msg)->{return msg.length();};
        System.out.println(function1.apply("HelloWorld"));
        Function<String,Integer> function2 = String::length;
        System.out.println(function2.apply("demo"));
//        BiFunction<String,Integer,String> function3 = String::substring;
//        String str = function3.apply("public static void main", 3);
//        System.out.println(str);

    }
}

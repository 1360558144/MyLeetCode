package org.zq.jdk.fun;

import java.util.function.Function;

/**
 * @description:
 * @author:zq
 * @time:8:20
 */
public class FunctionTest {
    public static void main(String[] args) {
        fun1(msg ->{
            return Integer.parseInt(msg);
        });
    }

    public static void fun1(Function<String,Integer> function){
        Integer apply = function.apply("666");
        System.out.println(apply);
    }
}

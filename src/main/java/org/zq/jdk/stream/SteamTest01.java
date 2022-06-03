package org.zq.jdk.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author:zq
 * @time:10:30
 */
public class SteamTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三","张三丰","张无忌","成龙","周星驰");
        list.stream()
                .filter(data -> data.startsWith("张"))
                .filter(data -> data.length() ==  3)
                .forEach(msg -> System.out.println(msg));
        System.out.println("----------------");
        list.stream()
                .filter(data -> data.startsWith("张"))
                .filter(data -> data.length() ==  3)
                .forEach(System.out::println);
    }
}

package org.zq.jdk.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author:zq
 * @time:19:40
 */
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","cc","bc","","efg","gh");
//        List<String> collect = strings.stream().filter(msg -> msg.contains("f")).collect(Collectors.toList());
//        List<String> collect = strings.stream().distinct().collect(Collectors.toList());
        List<String> collect = strings.stream().map(str -> "itheima_" + str).collect(Collectors.toList());
        System.out.println(collect);
//        strings.stream().flatMap()
    }
}

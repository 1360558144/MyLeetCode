package org.zq.jdk.stream;

import org.zq.domain.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author:zq
 * @time:16:27
 */
public class StreamTest04 {
    public static void main(String[] args) {
//        List<String> list = Stream.of("aa", "bb", "cc", "aa")
//                .collect(Collectors.toList());
//        System.out.println(list);
//        Set<String> set = Stream.of("aa", "bb", "cc", "aa")
//                .collect(Collectors.toSet());
//        System.out.println(set);
//        ArrayList<String> arrayList = Stream.of("aa", "bb", "cc", "aa")
//                .collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(arrayList);
//        HashSet<String> hashSet = Stream.of("aa", "bb", "cc", "aa")
//                .collect(Collectors.toCollection(HashSet::new));
//        System.out.println(hashSet);
        long l1 = System.currentTimeMillis();
        Integer[] arr = new Integer[100000];
        for(int i = 0;i < arr.length;i ++){
            arr[i] = i;
        }
        Stream.of(arr)
                .parallel()
                .filter(msg -> {
                    System.out.println(Thread.currentThread() + "msg=" + msg);
                    return msg > 2;
                }).count();
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
    }
}

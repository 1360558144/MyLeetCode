package org.zq.jdk.stream;

import org.zq.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description:
 * @author:zq
 * @time:12:21
 */
public class StreamTest02 {
    public static void main(String[] args) {
//        Integer[] arr1 = {1,2,3,4,5};
//        Stream<Integer> stream1 = Stream.of(arr1);
//        stream1.forEach(System.out::println);

//        Integer[] arr2 = {4,3,5,2,6,34,5,6,4,3,5,2,5,3};
//        Stream<Integer> stream2 = Stream.of(arr2);
//        stream2.skip(3).forEach(System.out::println);
//        Integer[] arr3 = {4,3,5,2,6,34,5,6,4,3,5,2,5,3};
//        Stream.of(arr3)
//                .distinct()
//                .sorted(((o1, o2) -> o2 - o1))
//                .forEach(System.out::println);
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三",14,166));
        userList.add(new User("李四",18,170));
        userList.add(new User("王五",20,165));
        Integer sum = userList.stream()
                .map(User::getAge)
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}

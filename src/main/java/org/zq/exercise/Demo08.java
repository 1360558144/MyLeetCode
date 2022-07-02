package org.zq.exercise;

import org.zq.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Stream;

/**
 * @description:
 * @author:zq
 * @time:20:33
 */
public class Demo08 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("aa",18,188));
        userList.add(new User("bb",19,170));
        userList.add(new User("cc",18,166));
        userList.add(new User("dd",19,177));
        userList.add(new User("ee",18,170));
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getHeight().equals(o2)){
                    return o1.getAge() - o2.getAge();
                }
                return o1.getHeight() - o2.getHeight();
            }
        });
        System.out.println(userList);
//        Collections.sort(userList,)
    }

}

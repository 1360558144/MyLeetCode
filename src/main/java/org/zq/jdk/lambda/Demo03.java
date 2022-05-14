package org.zq.jdk.lambda;

import org.zq.domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author:zq
 * @time:8:31
 */
public class Demo03 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三",11,160));
        userList.add(new User("李四",20,170));
        userList.add(new User("王五",25,172));
        userList.add(new User("赵六",18,177));
//        Collections.sort(userList, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        Collections.sort(userList,(User u1,User u2) -> {return u1.getHeight()-u2.getHeight();});
        for (User user : userList) {
            System.out.println(user);
        }
    }
}

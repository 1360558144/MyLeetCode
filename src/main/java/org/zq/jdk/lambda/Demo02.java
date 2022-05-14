package org.zq.jdk.lambda;

/**
 * @description:
 * @author:zq
 * @time:8:24
 */
public class Demo02 {
    public static void main(String[] args) {
        goShow((String name)->{return "666";});
    }

    public static void goShow(UserService userService){
        userService.show("zhansan");
    }
}

package org.zq.jdk.fun;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @description:
 * @author:zq
 * @time:9:04
 */
public class FunctionRefTest01 {
    public static void main(String[] args) {
        Date nowDate = new Date();
        Supplier<Long> supplier1 = () ->{return nowDate.getTime();};
        System.out.println(supplier1.get());
        Supplier<Long> supplier2 = nowDate::getTime;
        System.out.println(supplier2.get());
    }

}

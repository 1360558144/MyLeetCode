package org.zq.jdk.fun;

import java.util.function.Supplier;

/**
 * @description:
 * @author:zq
 * @time:9:15
 */
public class FunctionRefTEst02 {
    public static void main(String[] args) {
//        Supplier<Long> supplier1 = ()->{return System.currentTimeMillis();};
//        System.out.println(supplier1.get());

        Supplier<Long> supplier2 = System::currentTimeMillis;
        System.out.println(supplier2.get());
    }
}

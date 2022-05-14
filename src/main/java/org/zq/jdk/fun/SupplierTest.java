package org.zq.jdk.fun;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @description:
 * @author:zq
 * @time:11:05
 */
public class SupplierTest {
    public static void main(String[] args) {
        fun1(() -> {
            int[] arr = {21,34,456,234,352,3,24,234,234,654,243,23};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

    public static void fun1(Supplier<Integer> supplier){
        int max =supplier.get();
        System.out.println(max);
    }
}

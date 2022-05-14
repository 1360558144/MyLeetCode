package org.zq.jdk.fun;

/**
 * @description:
 * @author:zq
 * @time:10:34
 */
public class DemoFun01 {
    public static void main(String[] args) {
        fun1(arr -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        });
    }

    public static void fun1(Operation operation){
        int[] a = {1,2,3,4};
        int sum = operation.sum(a);
        System.out.println("sum="+sum);
    }
}

interface Operation{
    int sum(int[] arr);
}

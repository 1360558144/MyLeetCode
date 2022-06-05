package com.zq.jdk.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @description:
 * @author:zq
 * @time:17:41
 */

public class StreamTest {

    private static long times = 100000000;
    private  long start;
    @Before
    public void before(){
        start = System.currentTimeMillis();
    }
    @After
    public void after(){
        long after = System.currentTimeMillis();
        System.out.println("计算时间为："+(after - start));
    }
    @Test
    public void test01(){
        System.out.println("for循环：");
        long res = 0;
        for(long i = 0;i < times;i ++){
            res += i;
        }
    }
    @Test
    public void test02(){
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i < 1000;i ++){
            list1.add(i);
        }
        System.out.println(list1.size());
        List<Integer> list2 = Collections.synchronizedList(new ArrayList<>());

//        Vector<Integer> vector = new Vector<>();
        list1.parallelStream()
                .forEach(msg ->{
                    list2.add(msg);
                });
        System.out.println(list2.size());
    }
}

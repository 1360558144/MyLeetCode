package org.zq.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，
 * 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * @author:zq
 * @time:2022/5/4 0004
 */
public class Demo350 {

    /*
    * 使用hash表
    * */
    public static void main(String[] args) {
        Demo350 demo350 = new Demo350();
        int a[] = {10,32,5,5,4,3,3,3};
        int b[] = {10,8,7,10,5,3,3};
        int[] ints = demo350.intersect1(a, b);
        System.out.println(Arrays.toString(ints));
    }
    public int[] intersect1(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap();
        if(nums1.length > nums2.length){
            intersect1(nums2,nums1);
        }
        for(int i = 0;i < nums1.length;i ++){
            if(map.containsKey(nums1[i])){
                Integer integer = map.get(nums1[i]);
                map.put(nums1[i],integer + 1);
                continue;
            }
            map.put(nums1[i],0);
        }
        int index = 0;
        int[] intersect = new int[nums1.length];
        for(int i = 0;i < nums2.length;i ++){
            if(map.containsKey(nums2[i])){
                Integer integer = map.get(nums2[i]);
                intersect[index ++] = nums2[i];
                if(integer == 0 ){
                    map.remove(nums2[i]);
                    continue;
                }
                map.put(nums2[i],integer - 1);

            }
        }
        return Arrays.copyOfRange(intersect,0,index);
    }
}

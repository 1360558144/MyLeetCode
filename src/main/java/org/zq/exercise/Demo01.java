package org.zq.exercise;

import java.util.HashMap;

/**
 * @description:两数相加：给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * @author:zq
 * @time:2022/5/4 0004
 */
public class Demo01 {

    /*
    * 使用数组枚举
    * 时间复杂度O(n^2)
    * 空间复杂度O(1)
    * */
    public int[] twoSum1(int[] nums,int target){
        for(int i = 0;i < nums.length;i ++){
            for(int j = i + 1;j < nums.length;j ++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    /*
    * 使用哈希表
    * 时间复杂度O(n)
    * 空间复杂度O(n)
    * */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i < nums.length;i ++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{i,hashMap.get(target-nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}

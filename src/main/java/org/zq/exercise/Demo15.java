package org.zq.exercise;

import java.util.*;

/**
 * @description:三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * @author:zq
 * @time:7:38
 */

public class Demo15 {
    public static void main(String[] args) {
        Demo15 demo = new Demo15();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = demo.threeSum(nums);
        lists.stream().forEach(System.out::println);
    }
    public List<List<Integer>> threeSum(int[] nums) {// 总时间复杂度：O(n^2)

        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || nums.length <= 2) return ans;
        Arrays.sort(nums);//O(nlogn)
        for(int i = 0;i < nums.length - 2;i ++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int left = i + 1,right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] == target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }else if(nums[left] + nums[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}

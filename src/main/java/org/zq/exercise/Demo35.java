package org.zq.exercise;

/**
 * @description:搜索插入位置
 * @author:zq
 * @time:19:41
 */
public class Demo35 {
    public static void main(String[] args) {
        Demo35 demo35 = new Demo35();
        int[] nums = {2,4,5,7,9,11,13};
        int i = demo35.searchInsert(nums, 2);
        System.out.println(i);
    }
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0,right = n - 1;
        while(left <= right){
            int mid = ((right - left) >> 1) + left;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}

package org.zq.exercise;

/**
 * @description:
 * @author:zq
 * @time:2022/5/5 0005
 */
public class Demo121 {
    /*
    * 贪心法
    * */
    public static void main(String[] args) {
        Demo121 demo121 = new Demo121();
        int[] a = {7,1,5,3,6,4};
        int i = demo121.maxProfit(a);
        System.out.println(i);
    }
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0;i < prices.length;i ++){
            minPrice = Math.min(minPrice,prices[i]);
            result = Math.max(result,prices[i] - minPrice);
        }
        return result;
    }
}

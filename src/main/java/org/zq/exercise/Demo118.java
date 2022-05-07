package org.zq.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:杨辉三角
 * @author:zq
 * @time:7:11
 */
public class Demo118 {
    /*
    * 第n行的第i个数据等于第n-1行的第i-1个数和第i个数相加
    * */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0;i < numRows;i ++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j <= i;j ++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(row);
        }
        return lists;
    }
}

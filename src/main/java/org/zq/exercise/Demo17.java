package org.zq.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:电话号码的字母组合
 * @author:zq
 * @time:20:45
 */
public class Demo17 {
    public static void main(String[] args) {
        Demo17 demo = new Demo17();

    }
    //数字到号码的映射
    private String[] map = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    //路径
    private StringBuilder sb = new StringBuilder();
    //结果集
    private List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits){
        if(digits == null && digits.length() == 0) return res;
        backtrack(digits,0);
        return res;
    }
    //回溯函数
    private void backtrack(String digits,int index){

    }
}

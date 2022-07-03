package org.zq.exercise;

/**
 * @description:最长公共前缀
 * @author:zq
 * @time:7:39
 */
public class Demo14 {
    public static void main(String[] args) {
        Demo14 demo14 = new Demo14();
        String[] strs = {"publicsfg","publicewsdf","publifdr"};
        String s = demo14.longestCommonPrefix(strs);
        System.out.println(s);
    }
    public String longestCommonPrefix(String[] strs) {
        if(null == strs || 0 == strs.length){
            return "";
        }
        int n = strs.length;
        String maxPre = strs[0];
        for(int i = 1;i < n;i ++){
            maxPre = longestCommonPrefix(maxPre,strs[i]);
            if(0 == maxPre.length()){
                return "";
            }
        }
        return maxPre;
    }

    public String longestCommonPrefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while(index < length && str1.charAt(index) == str2.charAt(index)){
            index ++;
        }
        return str1.substring(0,index);
    }
}

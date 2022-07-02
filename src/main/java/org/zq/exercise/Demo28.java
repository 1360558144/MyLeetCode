package org.zq.exercise;

/**
 * @description:
 * @author:zq
 * @time:20:16
 */
public class Demo28 {
    public static void main(String[] args) {
        Demo28 demo28 = new Demo28();
        String str1 = "Hello World";
        String str2 = "";
        int i = demo28.strStr(str1, str2);
        System.out.println(i);
    }
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

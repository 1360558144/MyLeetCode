package org.zq.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:整数转罗马数字
 * @author:zq
 * @time:7:45
 */
public class Demo12 {
    public static void main(String[] args) {
        Demo12 demo = new Demo12();
        String s = demo.intToRoman(1994);
        System.out.println(s);
    }

    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i = 0;i < values.length;i ++){
            int value = values[i];
            String symbol = symbols[i];
            while(num >= value){
                num -= value;
                roman.append(symbol);
                if(num == 0){
                    return roman.toString();
                }
            }
        }
        return roman.toString();
    }
}

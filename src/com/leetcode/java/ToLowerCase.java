package com.leetcode.java;

/**
 * @ClassName ToLowerCase
 * @Description 转换大小写
 * @Author zgz
 * @Date 2019-02-15 09:51
 * @Version 1.0
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char e = str.charAt(i);
            if(e >= 'A' && e <= 'Z'){
                e += 32;
            }
            sb.append(e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        String lowerCase = new ToLowerCase().toLowerCase(str);
        System.out.println(lowerCase);
    }
}
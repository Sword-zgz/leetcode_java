package com.leetcode.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MosiSecretCode
 * @Description 804. 唯一摩尔斯密码词
 * @Author zgz
 * @Date 2019-02-15 15:58
 * @Version 1.0
 */
public class MosiSecretCode {

    public int uniqueMorseRepresentations(String[] words) {

        //存放字母与摩斯密码对应关系的数组
        String[] mosicodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<String>();
        for (String word : words) {
            //用于拼接单词翻译成的摩斯密码
            StringBuffer sb = new StringBuffer();

            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                 sb.append(mosicodes[chars[i]-'a']);

            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        int morseRepresentations = new MosiSecretCode().uniqueMorseRepresentations(words);
        System.out.println("morseRepresentations:"+morseRepresentations);
    }
}

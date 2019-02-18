package com.leetcode.java;

/**
 * @ClassName Jewel
 * @Description 771.宝石与石头
 * @Author zgz
 * @Date 2019-02-14 16:52
 * @Version 1.0
 */
public class Jewel {

    /**
     * @Description  暴力破解方法，双层for循环
     * @Author zgz
     * @Date  2019/2/14 17:02
     * @Param [J, S]
     * @return int
     **/
    public int numJewelsInStones(String J, String S) {
        char [] j = J.toCharArray();
        char [] s = S.toCharArray();
        int k = 0;
        for (int i = 0;i < j.length;i++) {
            for (int a = 0;a < s.length;a++) {
                if (j[i] == s[a]) {
                    k ++;
                }
            }
        }
        return k;
    }


    public static void main(String[] args) {
        String  J = "aA", S = "aAAbbbb";
        Jewel jewel = new Jewel();
        int i = jewel.numJewelsInStones(J, S);
        System.out.println("我的石头中是宝石的数量为："+i);

    }

}

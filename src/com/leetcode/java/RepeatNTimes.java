package com.leetcode.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName RepeatNTimes
 * @Description 961. 重复 N 次的元素
 * @Author zgz
 * @Date 2019-02-15 11:21
 * @Version 1.0
 */
public class RepeatNTimes {


    public int repeatedNTimes(int[] A) {
        int res = A[0];
        int[] countArr = new int[10000];
        for (int i : A) {
            countArr[i]++;
            if (countArr[i] == A.length / 2) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,3};
        RepeatNTimes repeatNTimes = new RepeatNTimes();
        int i = repeatNTimes.repeatedNTimes(A);
        System.out.println(i);
    }

}

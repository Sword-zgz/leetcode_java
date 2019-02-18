package com.leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SortOddAndEven
 * @Description 905. 按奇偶排序数组
 * @Author zgz
 * @Date 2019-02-15 12:21
 * @Version 1.0
 */
public class SortOddAndEven {

    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                int tmp = A[i];
                A[i] = A[index];
                A[index++] = tmp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {3,1,2,4};

        int[] arrayByParity = new SortOddAndEven().sortArrayByParity(a);
        System.out.println(Arrays.toString(arrayByParity));
    }
}

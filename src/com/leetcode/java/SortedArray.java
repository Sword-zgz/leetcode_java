package com.leetcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName SortedArray
 * @Description 977.有序数组的平方
 * @Author zgz
 * @Date 2019-02-14 17:07
 * @Version 1.0
 */
public class SortedArray {


    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];

        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] A = new int[] {-4,-1,0,3,10};
        int[] squares = new SortedArray().sortedSquares(A);
        System.out.println(Arrays.toString(squares));
    }

}

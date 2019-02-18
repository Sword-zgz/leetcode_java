package com.leetcode.java;

import java.util.Arrays;

/**
 * @ClassName QueryEvenQueryNum
 * @Description 985. 查询后的偶数和
 * @Author zgz
 * @Date 2019-02-15 10:31
 * @Version 1.0
 */
public class QueryEvenQueryNum {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int answer[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
           int val   = queries[i][0];
           int index = queries[i][1];
           A[index] +=  val;
           //整数之和
           int sum = 0;
           for (int j = 0; j < A.length; j++) {
                if(A[j]%2 == 0){
                   sum +=  A[j];
                }
           }
           answer[i] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int queries[][] = {{1,0},{-3,1},{-4,0},{2,3}};
        QueryEvenQueryNum queryNum = new QueryEvenQueryNum();
        int[] afterQueries = queryNum.sumEvenAfterQueries(A, queries);
        System.out.println(Arrays.toString(afterQueries));
    }
}

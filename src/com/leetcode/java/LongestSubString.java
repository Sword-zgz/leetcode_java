package com.leetcode.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LongestSubString
 * @Description 无重复字符的最长子串
 * 复杂度分析
 *
 * 时间复杂度：O(2n) = O(n)，在最糟糕的情况下，每个字符将被 i 和 j 访问两次。
 *
 * 空间复杂度：O(min(m, n))，与之前的方法相同。滑动窗口法需要 O(k) 的空间，其中 k 表示 Set 的大小。而Set的大小取决于字符串 n 的大小以及字符集/字母 m 的大小。
 * @Author zgz
 * @Date 2019-02-14 16:22
 * @Version 1.0
 */
public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = new LongestSubString().lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

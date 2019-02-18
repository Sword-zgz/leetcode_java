package com.leetcode.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName AddTwoNumbers
 * @Description 2.两数相加
 * @Author zgz
 * @Date 2019-02-14 10:57
 * @Version 1.0
 */
public class AddTwoNumbers {

    ListNode result = new ListNode(0);  //定义计算结果的node
    ListNode head = result;             //头节点
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        add(l1,l2,0);
        return head.next;
    }
    //递归计算   addNumber是进位
    public void add(ListNode l1, ListNode l2,int addNumber){
        if(l1 != null || l2 != null){
            int num = (l1==null?0:l1.val) + (l2==null?0:l2.val) + addNumber;
            addNumber = num/10;     //计算进位
            num = num%10;
            ListNode node = new ListNode(num);
            result.next = node;
            result = node;
            add(l1==null?l1:l1.next,l2==null?l2:l2.next,addNumber);
        }else if(addNumber!=0){
            result.next = new ListNode(addNumber);
        }
    }

    public static void main(String[] args) {
        ListNode _342 = new ListNode(2);
        _342.next = new ListNode(4);
        _342.next.next = new ListNode(3);

        ListNode _465 = new ListNode(5);
        _465.next = new ListNode(6);
        _465.next.next = new ListNode(4);

        ListNode result = new AddTwoNumbers().addTwoNumbers(_342, _465);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
    }

}

package com.jz.forge.leetcode.合并有序链表;

/**
 * 合并有序链表
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * <p>
 * 提示：
 * <p>
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static class Solution {
        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode res = l1.val <= l2.val ? l1 : l2;
            res.next =mergeTwoLists(res.next,l1.val > l2.val ?l1 : l2);
            return res;
        }


            public static int[] plusOne(int[] digits) {
                int index = digits.length-1;
                if(digits.length==1&&digits[0]==0){
                    return new int[]{1};
                }
                int goal = digits[index]+=1;
                digits[index] = goal;
                while(index>=0){
                   if( goal==10){
                       digits[index] =0;
                       if(index==0){
                           int[] result =new int[digits.length+1];
                           result[0]=1;
                           return result;
                       }
                       index--;
                       goal = digits[index]+1;
                   }else {
                       index--;
                   }
                }
                return digits;
            }



        public static void main(String[] args) {
//            ListNode node1 = new ListNode();
//            node1.val = 1;
//            ListNode node2 = new ListNode();
//            node2.val = 2;
//            node1.next = node2;
//            ListNode node3 = new ListNode();
//            node3.val = 4;
//            node2.next = node3;
//
//            ListNode node4 = new ListNode();
//            node4.val = 1;
//            ListNode node5 = new ListNode();
//            node5.val = 3;
//            node4.next = node5;
//            ListNode node6 = new ListNode();
//            node6.val = 4;
//            node5.next = node6;
//            ListNode.Solution solution = new ListNode.Solution();
//            ListNode x = solution.mergeTwoLists(node1, node4);
            //  int[] xx = new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
                      int[] xx = new int[]{9};
            plusOne(xx);
            System.out.println();
        }
    }
}
package chapter9;
import java.util.*;
/*
 * 题目描述
有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。
编写函数对这两个整数求和，并用链表形式返回结果。
给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。
测试样例：
{1,2,3},{3,2,1}
返回：{4,4,4}
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class LinkedListPlus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode res = plus(a,b,0);
		return res;
    }
    
    public static ListNode  plus(ListNode a,ListNode b,int carry)
	{
		if(a == null && b == null && carry == 0)
			return null;
		
		int value = carry;
		if(a != null)
			value += a.val;
		if(b != null)
			value += b.val;
		
        ListNode node = new ListNode(value % 10);
		
		ListNode rest = plus(a == null?null:a.next, b == null?null:b.next, value>=10?1:0);
		node.next = rest;
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

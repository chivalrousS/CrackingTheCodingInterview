package chapter9;
import java.util.*;
/*
 * 题目描述
请编写一个函数，检查链表是否为回文。
给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
测试样例：
{1,2,3,2,1}
返回：true
{1,2,3,2,3}
返回：false
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Palindrome { 
	public boolean isPalindrome(ListNode pHead) {
    // write code here
		ListNode slow = pHead,fast = pHead;
		Stack<Integer> stack = new Stack<Integer>();
		while(fast != null && fast.next != null)
		{
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null)
			slow = slow.next;
		
		while(slow != null)
		{
			int value = stack.pop();
			if(value != slow.val)
			   return false;
		}
		return true;
    }
}

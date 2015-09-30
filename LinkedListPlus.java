package chapter9;
import java.util.*;
/*
 * ��Ŀ����
�������������ʾ��������ÿ��������һ����λ����Щ��λ�Ƿ����ŵģ�Ҳ���Ǹ�λ����������ײ���
��д������������������ͣ�����������ʽ���ؽ����
������������ListNode* A��ListNode* B���뷵��A+B�Ľ��(ListNode*)��
����������
{1,2,3},{3,2,1}
���أ�{4,4,4}
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

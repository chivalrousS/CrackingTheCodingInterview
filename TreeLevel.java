package chapter9;
/*
 * 题目描述
对于一棵二叉树，请设计一个算法，创建含有某一深度上所有结点的链表。
给定二叉树的根结点指针TreeNode* root，以及链表上结点的深度，请返回一个链表ListNode，代表该深度上所有结点的值，
请按树上从左往右的顺序链接，保证深度不超过树的高度，树上结点的值为非负整数且不超过100000。
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreeLevel {
	 public ListNode getTreeLevel(TreeNode root, int dep) {
	        // write code here
	        if(dep < 0 || root == null){
	            return null;
	        }
	        int start = 0, end = 1;
	        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        int depCount = 1;
	        while(!queue.isEmpty()){
	            TreeNode cur = queue.remove();
	            if(depCount == dep){
	                result.add(cur);
	            }
	            start++;
	            if(cur.left != null){
	                queue.add(cur.left);
	            }
	            if(cur.right != null){
	                queue.add(cur.right);
	            }
	            if(start == end){
	                if(depCount==dep){
	                    break;
	                }else{
	                    depCount++;
	                    start = 0;
	                    end = queue.size();
	                }
	            }
	        }
	        if(result.size() == 0){
	            return null;
	        }else{
	            ListNode head = new ListNode(result.get(0).val);
	            ListNode p = head;
	            for(int i = 1; i < result.size(); i++){
	                p.next = new ListNode(result.get(i).val);
	                p = p.next;
	            }
	            return head;
	        }  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

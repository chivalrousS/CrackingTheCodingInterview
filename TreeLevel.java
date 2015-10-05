package chapter9;

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

package chapter9;

/*
 * 题目描述:
 * 设计一个算法，找出二叉查找树中指定节点的“下一个”节点，即中序后继。
 * 可以假定每个节点都含有指向父节点的链接。
 */

/*
 * 思路：
 * 主要分为2种大的情况：
 * (1)当前节点有右子数，此时返回该节点的右子树的最左边的节点
 * (2)当前节点没有右子树，则又分2种情况：
 *    <1>若当前节点在其父节点的左边，则下次该访问的就是其父节点
 *    <2>若当前节点在其父节点的右边，则说明已遍历过其父节点的子树，此时需要从其父节点向上访问，直到找到未完全遍历的父节点。
 */
public class InorderTraversal {
	public TreeNode inorderSucc(TreeNode n)
	{
		if(n == null)
			return null;
		
		if(n.right != null) //n 有右子树时，则返回其右子树的最左边的节点
			return leftMostChild(n.right);
		else {
			TreeNode q = n;
			TreeNode x = q.parent;
			//直到找到某节点未被遍历的情况，即当前分支在父节点的左边
			while(x != null && x.left !=q)
			{
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
	
	public TreeNode leftMostChild(TreeNode n)
	{
		if(n == null)
			return null;
		while(n.left != null)
			n = n.left;
		return n;
	}

}

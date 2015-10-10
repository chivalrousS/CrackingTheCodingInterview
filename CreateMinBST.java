package chapter9;
/*
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉查找树。
 */
public class CreateMinBSTTest {
	TreeNode createMinBST(int[] arr)
	{
		return createMinBST(arr,0,arr.length-1);
	}
	
	TreeNode createMinBST(int[] arr,int low,int high)
	{
		if(low > high)
			return null;
		int mid = low + (high - low)/2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = createMinBST(arr,low,mid-1);
		node.right = createMinBST(arr,mid+1,high);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

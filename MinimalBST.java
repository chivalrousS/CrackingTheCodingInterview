package chapter9;
import java.util.*;
/*
 * 题目描述
对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。
 */
public class MinimalBST {
	public static int buildMinimalBST(int[] vals) {
	     // write code here
             double value = vals.length + 1.0;
	     return (int)Math.ceil(Math.log(value)/Math.log(2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals = {1,2,3,4,5,6,7,8};
		System.out.println(buildMinimalBST(vals));
	}
}

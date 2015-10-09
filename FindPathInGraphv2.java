package chapter9;
import java.util.*;

/*
 * 题目描述
对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。
给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b(请不要在意数据类型，图是有向图),
请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。
 */
public class FindPathInGraphv2 {
	/*
	public class UndirectedGraphNode {
	    int label = 0;
	    UndirectedGraphNode left = null;
	    UndirectedGraphNode right = null;
	    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

	    public UndirectedGraphNode(int label) {
	        this.label = label;
	    }
	}*/
	
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
		if(null == a || null == b)
			return false;
		return FindPath(a,b) || FindPath(b, a);
    }
	
	public static boolean FindPath(UndirectedGraphNode a, UndirectedGraphNode b)
	{
		LinkedList<UndirectedGraphNode> quque = new LinkedList<UndirectedGraphNode>();
		HashSet<UndirectedGraphNode> set = new HashSet<UndirectedGraphNode>();
		quque.add(a);
		while(!quque.isEmpty())
		{
			UndirectedGraphNode tmp = quque.removeFirst();
			set.add(tmp);
			if(b == tmp)
				return true;
			else {
				for(UndirectedGraphNode v:tmp.neighbors)
				{
					if(!set.contains(v))
						quque.add(v);
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

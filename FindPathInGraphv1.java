package chapter9;
import java.util.*;
/*
 * 给定有向图，设计一个算法，找出两个结点之间是否存在一条路径。
 */

public class FindPathInGraphv1 {
	public enum State{
		Unvisited,Visited,Visiting;
	}
	public static boolean search(Graph g,Node start,Node end)
	{
		LinkedList<Node> quque = new LinkedList<Node>();
		for(Node u:g.getNodes())
		{
			u.state = State.Unvisited;
		}
		
		start.state = State.Visiting;
		quque.add(start);
		Node u;
		while(!quque.isEmpty())
		{
			u = quque.removeFirst();
			if(u != null)
			{
				for(Node v:u.getAdjacent())
				{
					if(v.state == State.Unvisited)
					{
						if(end == v)
							return true;
						else {
							v.state = State.Visiting;
							quque.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

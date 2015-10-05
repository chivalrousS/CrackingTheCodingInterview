package chapter9;
import java.util.*;
/*
 * 题目描述
请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，
当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。
给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，每个操作的第一个数代表操作类型，
若为1，则为push操作，后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。
请返回一个int[][](C++为vector<vector<int>>)，为完成所有操作后的SetOfStacks，
顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。
 */

public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
    	  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
          ArrayList<Integer> tmp = new ArrayList<Integer>();
          if (ope == null || ope.length == 0)
              return res;
          for (int i = 0; i < ope.length; i++) {
              if (ope[i][0] == 1) {
                  if (tmp.size() == size) {
                      res.add(tmp);
                      tmp = new ArrayList<Integer>();
                  }
                  tmp.add(ope[i][1]);
              }
   
              if (ope[i][0] == 2) {
                  if (tmp.size() <= 0) {
                      tmp = res.get(res.size() - 1);
                      res.remove(res.size() - 1);
                  }
                  tmp.remove(tmp.size() - 1);
              }
          }
          if (tmp.size()!=0)
              res.add(tmp);
          return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

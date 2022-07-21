package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReverserLevelOrder {
	
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node t=q.poll();
            list.add(t.data);
            if(t.right!=null)
            q.add(t.right);
            if(t.left!=null)
            q.add(t.left);
        }
         ArrayList<Integer> ans=new ArrayList<>();
         for(int i=list.size()-1;i>=0;--i){
             ans.add(list.get(i));
         }
         return ans;
        
        
    }


}

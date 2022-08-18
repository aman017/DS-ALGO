package tree;

public class DistanceBtw2Nodes {

	//approch 1
	int dis = 0;

	int findDist1(Node root, int a, int b) {
		// Your code here
		solve(root, a, b);
		return dis;
	}

	public int solve(Node node, int a, int b) {

		if (node == null)
			return 0;

		int l = solve(node.left, a, b);
		int r = solve(node.right, a, b);

		if (node.data == a || node.data == b) {
			if (l == 0 && r == 0)
				return 1;
			else {
				dis = Math.max(l, r);
				return Math.max(l, r);
			}
		}

		if (l != 0 && r != 0)
			dis = l + r;

		if (l != 0 || r != 0)
			return 1 + l + r;

		return l + r;
	}
	
	//approch 2
	//lca->a+lca->b
	int findDist2(Node root, int a, int b) {
        // Your code here
        
        Node lca=findLCA(root,a,b);
        
        int d1=findDistance(lca,a)-1;
        int d2=findDistance(lca,b)-1;
        return d1+d2;
        
    }
    
    public int findDistance(Node node,int a){
        
        if(node==null) return 0;
        
        if(node.data==a) return 1;
        
        int l=findDistance(node.left,a);
        int r=findDistance(node.right,a);
        
        if(l!=0 ||r!=0) return Math.max(l,r)+1;
        
        return 0;
    }
    
    public Node findLCA(Node node , int a,int b){
        
        if(node==null) return null;
        
        if(node.data==a||node.data==b) return node;
        
        Node l=findLCA(node.left,a,b);
        Node r=findLCA(node.right,a,b);
        
        if(l==null) return r;
        if(r==null) return l;
        
        return node;
    }
    
  //approch 2
  	//root->a+root->b-root->lca

}

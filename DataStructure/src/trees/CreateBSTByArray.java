package trees;

import java.util.Scanner;

public class CreateBSTByArray {
	
	static class Node{
		int val;
		Node right;
		Node left;
		public Node(int k) {
			right=null;
			left=null;
			val=k;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Sorted Array Size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Sorted Array:");
		int[] ar=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		
		Node root=createTree(ar,0,ar.length-1);
		System.out.print("Inorder of tree:");
		printInOrder(root);
	}

	private static void printInOrder(Node root) {
		if(root==null) {
			return;
		}
		printInOrder(root.left);
		System.out.print(root.val+" ");
		printInOrder(root.right);
		
	}

	private static Node createTree(int[] ar, int start, int end) {
		if(start>end )
			return null;
		int mid=(start+end)/2;
		int k=ar[mid];
		Node node=new Node(k);
		node.left=createTree(ar, start, mid-1);
		node.right=createTree(ar, mid+1,end);
		
		return node;
	}

}

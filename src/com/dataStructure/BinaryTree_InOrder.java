package com.dataStructure;


public class BinaryTree_InOrder {

	 public static class TreeNode{
		   int data;
		   TreeNode left;
		   TreeNode right;
		   public TreeNode(int data) {
			this.data=data;
		}
	   }
		
		public static TreeNode createBinaryTree(){
			TreeNode root= new TreeNode(40);
			
			TreeNode node20= new TreeNode(20);
			TreeNode node10= new TreeNode(10);
			TreeNode node30= new TreeNode(30);
			TreeNode node60= new TreeNode(60);
			TreeNode node50= new TreeNode(50);
			TreeNode node70= new TreeNode(70);
			
			root.left=node20;
			node20.left=node10;
			node20.right=node30;
			
			root.right=node60;
			node60.left=node50;
			node60.right=node70;
			
			return root;
		}

	public void inOrderTraverse(TreeNode root){
		
		if(root !=null){
			inOrderTraverse(root.left);
			System.out.println(root.data);
			inOrderTraverse(root.right);
			
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree_InOrder order= new BinaryTree_InOrder();
		TreeNode root = createBinaryTree();
		order.inOrderTraverse(root);
		
		
	}

}

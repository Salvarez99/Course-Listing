package project04;
/**
 * Represents a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

import java.lang.reflect.Array;

public class BinarySearchTree<E extends Comparable<E>>{

	TreeNode<E> root;
	TreeNode<E> current;
	int count;

	public BinarySearchTree(){
		this.root = new TreeNode<E>();
		this.current = new TreeNode<E>();
		this.count = 0;
	}

	public BinarySearchTree(E rootItem){
		this.root = new TreeNode<E>(rootItem, null, null);
		this.current = this.root;
		this.count = 0;
	}

	public TreeNode<E> getRoot(){
		return root;

	}

	public void changeRoot(TreeNode<E> newRoot){
		//Needs to be implemented
		
	}

	public boolean isEmpty(){
		if (this.root == null) {
			return true;
		}
		return false;
	}

	public void makeEmpty(){
		root = new TreeNode<E>();
	}

	public boolean search(TreeNode<E> newTreeNode){
		//Needs to be implemented
		return false;

	}

	public void insert(TreeNode<E> newTreeNode){
		//Needs to be implemented
		//if empty add root
		
		//else if root has no children, compare node to root
		
		//else if root has children, compare node to root then move to child and compare
		
		//else set node equal to left or right depending on comparison
		
		if (isEmpty() == true) {
			this.root = newTreeNode;
		}else if (this.root.getLeft() == null && this.root.getRight() == null) {
			
		}
		
		
	}

	public void delete(){
		//Needs to be implemented
	}

	public void sort(){
		//Needs to be implemented
	}

	public int size(){
		//Needs to be implemented
		return count;

	}

	public Array[] convertBSTtoArr(){
		//Needs to be implemented
		return null;
	}
}

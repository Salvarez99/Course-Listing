package project04;
/**
 * Represents a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

import java.lang.reflect.Array;

public class BinarySearchTree<E extends Comparable<E>>{

	private TreeNode<E> root;
	private TreeNode<E> current = this.root;
	private int count;

	public BinarySearchTree(){
		this.root = new TreeNode<E>();
		this.current = this.root;
		this.count = 0;
	}

	public BinarySearchTree(E rootItem){
		this.root = new TreeNode<E>(rootItem, null, null);
		this.current = this.root;
		this.count++;
	}

	public TreeNode<E> getRoot(){
		return this.root;

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
		this.root = new TreeNode<E>();
		this.current = this.root;
		this.count = 0;
	}

	public boolean search(TreeNode<E> newTreeNode){
		//Needs to be implemented
		return false;

	}

	public void insert(TreeNode<E> newTreeNode){
		//Needs to be implemented
		/*
		 * CASE 1:
		 *	Tree is empty
		 *
		 * CASE 2: 
		 * 	CurrentTreeNode has no children
		 * 
		 * CASE 3:
		 * 	CurrentTreeNode has both children
		 * 
		 * CASE 4: 
		 * 	CurrentTreeNode has left child and no right child
		 * 
		 * CASE 5: 
		 * 	CurrentTreeNode has right child and no left child
		 * 
		 */

		if(isEmpty() == true && this.current == this.root) {
			//Tree is empty and current is equal to root

			this.root = newTreeNode;
			this.current = this.root;
			count++;

		}else if (this.current.getLeft() == null && this.current.getRight() == null) {
			//currentNode has no children

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	

				current.setRight(newTreeNode);
				current = current.getRight();
				count++;
				
			}else{
				//newTreeNode is less than or equal to currenNode
				current.setLeft(newTreeNode);
				current = current.getLeft();
				count++;
				
			}
		}else if (this.current.getLeft() != null && this.current.getRight() != null){
			//currentNode has both children

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current = current.getRight();
				insert(current);
				
			}else{
				//newTreeNode is less than or equal to currenNode
				current = current.getLeft();
				insert(current);

			}

		}else if (this.current.getLeft() != null && this.current.getRight() == null){
			//currentNode has left child

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current.setRight(newTreeNode);
				current = current.getRight();
				count++;
				
			}else{
				//newTreeNode is less than or equal to currenNode
				current = current.getLeft();
				insert(current);

			}

		}
		else if (this.current.getLeft() == null && this.current.getRight() != null){
			//currentNode has right child

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current = current.getRight();
				insert(current);
				
			}else{
				//newTreeNode is less than or equal to currenNode
				current.setLeft(newTreeNode);
				current = current.getLeft();
				count++;

			}

		}

		this.current = root;

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

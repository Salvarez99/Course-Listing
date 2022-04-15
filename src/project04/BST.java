package project04;
/**
 * Represents a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

import java.lang.reflect.Array;

public class BST<E extends Comparable<E>>{

	Node<E> root;
	Node<E> current;
	int count;

	public BST(){
		this.root = new Node<E>();
		this.current = new Node<E>();
		this.count = 0;
	}

	public BST(E rootItem){
		this.root = new Node<E>(rootItem, null, null);
		this.current = this.root;
		this.count = 0;
	}

	public Node<E> getRoot(){
		return root;

	}

	public void changeRoot(Node<E> newRoot){
		//Needs to be implemented
		
	}

	public boolean isEmpty(){
		if (this.root == null) {
			return true;
		}
		return false;
	}

	public void makeEmpty(){
		root = new Node<E>();
	}

	public boolean search(Node<E> newNode){
		//Needs to be implemented
		return false;

	}

	public void insert(Node<E> newNode){
		//Needs to be implemented
		//if empty add root
		
		//else if root has no children, compare node to root
		
		//else if root has children, compare node to root then move to child and compare
		
		//else set node equal to left or right depending on comparison
		
		if (isEmpty() == true) {
			this.root = newNode;
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

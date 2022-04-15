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

	public BST(Node<E> root){
		this.root = root;
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

	public boolean search(Node<E> item){
		//Needs to be implemented
		return false;

	}

	public void insert(Node<E> item){
		//Needs to be implemented
	}

	public void delete(){
		//Needs to be implemented
	}

	public Node<E> getNode(){
		return current;

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

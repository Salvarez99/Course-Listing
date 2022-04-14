package project04;

import java.lang.reflect.Array;

public class BST<E extends Comparable<E>> {
	
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
	
	public Node<E> getRoot();
	 
	
	 public void changeRoot(Node<E> newRoot);
	 
	 
	 public boolean isEmpty();
	 
	 
	 public void makeEmpty();
	 
	 
	 public boolean search(Node<E> item);
	 
	
	 public void insert(Node<E> item);
	 
	
	 public void delete();
	 
	 
	 public Node<E> getNode(Node<E> item);
	 
	
	 public void sort();
	 
	 
	 public int size();
	 
	 public Array[] convertBSTtoArr();

}

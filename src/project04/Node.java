package project04;
/**
 * Represents a node in a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

public class Node<E> {

	/**
	 * The element of this node
	 */
	Object item;
	
	/**
	 * The link to the left node
	 */
	Node<E> left;
	
	/**
	 * The link to the right node
	 */
	Node<E> right;
	
	/**
	 * Constructs a default node.
	 */
	public Node(){
		this(null, null, null);
	}
	
	/**
	 * Constructs a node with an item and a link to left node and right node.
	 * @param item A reference to the item of this node
	 * 		  left A reference to the left node 
	 * 		  right A reference to the right node
	 */
	public Node(Object item, Node<E> left, Node<E> right) {
		this.item = item;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * Constructs a node with an item and a link to left node.
	 * @param item A reference to the item of this node
	 * 		  left A reference to the left node
	 */
	public Node(Node<E> left, Object item) {
		this.left = left;
		this.item = item;
	}
	
	/**
	 * Constructs a node with an item and a link to right node.
	 * @param item A reference to the item of this node
	 * 		  right A reference to the right node
	 */
	public Node(Object item, Node<E> right) {
		this.item = item;
		this.right = right;
	}

	/**
	 * Returns the item of this node.
	 * @return The item of this node
	 */
	public Object getItem() {
		return item;
	}
	
	/**
	 * Changes the item of this node.
	 * @param A reference to an item
	 */
	public void setItem(Object item) {
		this.item = item;
	}
	
	/**
	 * Returns the left reference of this node.
	 * @return A reference to the left node of this node
	 */
	public Node<E> getLeft() {
		return left;
	}
	
	/**
	 * Changes the left reference of this node
	 * @param left A reference to the next node of this node
	 */
	public void setLeft(Node<E> left) {
		this.left = left;
	}
	
	/**
	 * Returns the right reference of this node.
	 * @return A reference to the right node of this node
	 */
	public Node<E> getRight() {
		return right;
	}
	
	/**
	 * Changes the right reference of this node
	 * @param right A reference to the next node of this node
	 */
	public void setRight(Node<E> right) {
		this.right = right;
	}
	
	/**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
	public String toString(){
		return getClass().getSimpleName() + ": " + this.item;
	}
	
	public boolean equals(Object item){
		return this.item == item;
	}
}

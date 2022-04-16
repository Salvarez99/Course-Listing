package project04;
/**
 * Represents a node in a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

public class TreeNode<E extends Comparable<E>> {
	
	/**
	 * The element of this node
	 */
	private E item;
	
	/**
	 * The link to the left node
	 */
	private TreeNode<E> left;
	
	/**
	 * The link to the right node
	 */
	private TreeNode<E> right;
	
	/**
	 * Constructs a default node.
	 */
	public TreeNode(){
		this(null, null, null);
	}
	
	/**
	 * Constructs a node with an item.
	 * @param item A reference to the item of this node
	 */
	public TreeNode(E item) {
		this.item = item;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * Constructs a node with an item and a link to left node and right node.
	 * @param item A reference to the item of this node
	 * 		  left A reference to the left node 
	 * 		  right A reference to the right node
	 */
	public TreeNode(E item, TreeNode<E> left, TreeNode<E> right) {
		this.item = item;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * Constructs a node with an item and a link to left node.
	 * @param item A reference to the item of this node
	 * 		  left A reference to the left node
	 */
	public TreeNode(TreeNode<E> left, E item) {
		this.left = left;
		this.item = item;
	}
	
	/**
	 * Constructs a node with an item and a link to right node.
	 * @param item A reference to the item of this node
	 * 		  right A reference to the right node
	 */
	public TreeNode(E item, TreeNode<E> right) {
		this.item = item;
		this.right = right;
	}

	/**
	 * Returns the item of this node.
	 * @return The item of this node
	 */
	public E getItem() {
		return item;
	}
	
	/**
	 * Changes the item of this node.
	 * @param A reference to an item
	 */
	public void setItem(E item) {
		this.item = item;
	}
	
	/**
	 * Returns the left reference of this node.
	 * @return A reference to the left node of this node
	 */
	public TreeNode<E> getLeft() {
		return left;
	}
	
	/**
	 * Changes the left reference of this node
	 * @param left A reference to the next node of this node
	 */
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
	
	/**
	 * Returns the right reference of this node.
	 * @return A reference to the right node of this node
	 */
	public TreeNode<E> getRight() {
		return right;
	}
	
	/**
	 * Changes the right reference of this node
	 * @param right A reference to the next node of this node
	 */
	public void setRight(TreeNode<E> right) {
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

package project04;
/**
 * Represents a BST iterator.
 * @author Stephen Alvarez
 * @version 1.0
 */
import java.util.LinkedList;

public class BinarySearchTreeIterator <E extends Comparable<E>> implements java.util.Iterator<E>{

	/**
	 * The collection traversed by this iterator
	 */
	private BinarySearchTree<E> bst;

	/**
	 * An ordered list of nodes traversed by this iterator. 
	 * Empty list indicates no traversal type currently selected or 
	 * end of current traversal has been reached
	 */
	private LinkedList <TreeNode<E>> list;

	/**
	 * Constructs an iterator over a binary bst. 
	 * @param bst A reference to a binary bst
	 */
	public BinarySearchTreeIterator(BinarySearchTree<E> bst) {
		this.bst = bst;
		this.list = new LinkedList<TreeNode<E>>();
	}

	/**
	 * Returns true if the iteration has more elements. 
	 * @return A boolean value specifying if there is an element to be returned
	 */
	public boolean hasNext() {
		return !this.list.isEmpty();
	}

	/**
	 * Returns the next element in the iteration.
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	public E next() throws java.util.NoSuchElementException {
		return this.list.remove().getItem();
	}

	/**
	 * @throws UnsupportedOperationException if the remove operation is not supported by this iterator
	 */
	public void remove() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the traversal type to be inorder.
	 */
	public void setInorder() {
		this.list.clear();
		this.inorder(this.bst.getRoot());
	}

	/**
	 * Traverses in inorder. 
	 * @param bstNode A reference to a bst node
	 */
	private void inorder(TreeNode<E> bstNode) {
		if(bstNode != null){
			inorder(bstNode.getLeft());
			this.list.add(bstNode);
			inorder(bstNode.getRight());

		}
	} 
} 


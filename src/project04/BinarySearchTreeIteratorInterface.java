package project04;

public interface BinarySearchTreeIteratorInterface<E> {
	
	/**
	 * Returns true if the iteration has more elements. 
	 * @return A boolean value specifying if there is an element to be returned
	 */
	public boolean hasNext();

	/**
	 * Returns the next element in the iteration.
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	public E next();

	/**
	 * @throws UnsupportedOperationException if the remove operation is not supported by this iterator
	 */
	public void remove();
	

	/**
	 * Sets the traversal type to be inorder.
	 */
	public void setInorder();
	

}
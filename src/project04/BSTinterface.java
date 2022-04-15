package project04;
import java.lang.reflect.Array;

public interface BSTinterface<E extends Comparable<E>> {

	
	 /*
	  * gets Roots
	  * @return Node<E> root
	  */
	 public Node<E> getRoot();
	 
	 /*
	  * changes current root
	  * @param Node<E> newRoot
	  */
	 public void changeRoot(Node<E> newRoot);
	 
	 /*
	  * checks if bst is empty
	  * @return boolean
	  */
	 public boolean isEmpty();
	 
	 /*
	  * makes BST empty
	  */
	 public void makeEmpty();
	 
	 /*
	  * searches for passed node in BST
	  * @return boolean
	  */
	 public boolean search(Node<E> newNode);
	 
	 /*
	  * inserts node into BST
	  * @param Node<E>
	  */
	 public void insert(Node<E> newNode);
	 
	 /*
	  * deletes current Node
	  */
	 public void delete();
	 
	 /*
	  * gets current node
	  * @param
	  */
	 public Node<E> getNode();
	 
	 /*
	  * sorts BST
	  */
	 public void sort();
	 
	 /*
	  * gets size of BST
	  * @return int size
	  */
	 public int size();
	 
	 /*
	  * converts BST to an Array
	  * @return Array
	  */
	 public Array[] convertBSTtoArr();
	 
}

package project04;
import java.lang.reflect.Array;

public interface BinarySearchTreeInterface<E extends Comparable<E>> {

	
	 /*
	  * gets Roots
	  * @return TreeNode<E> root
	  */
	 public TreeNode<E> getRoot();
	 
	 /*
	  * changes current root
	  * @param TreeNode<E> newRoot
	  */
	 public void changeRoot(TreeNode<E> newRoot);
	 
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
	 public boolean search(TreeNode<E> newTreeNode);
	 
	 /**
	  * adds TreeNode to BST
	  * @param root
	  * @param newTreeNode
	  */
	 public void add(TreeNode<E> newRoot, TreeNode<E> newTreeNode);
	 
	 /**
	  * inserts node into BST
	  * @param TreeNode<E>
	  */
	 public void insert(E item);
	 
	 /*
	  * deletes current TreeNode
	  */
	 public void delete();
	 
	 /*
	  * gets current node
	  * @param
	  */
	 public TreeNode<E> getTreeNode();
	 
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

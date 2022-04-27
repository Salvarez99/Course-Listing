package project04;
import java.lang.reflect.Array;
import java.util.LinkedList;

public interface BinarySearchTreeInterface<E extends Comparable<E>> {

	
	 /**
	  * gets Roots
	  * @return TreeNode<E> root
	  */
	 public TreeNode<E> getRoot();
	 
	 /**
	  * checks if BST is empty
	  * @return boolean
	  */
	 public boolean isEmpty();
	 
	 /**
	  * makes BST empty
	  */
	 public void makeEmpty();
	 
	 /**
	  * searches for passed item in BST
	  * @param E item
	  * @return boolean
	  */
	 public boolean search(E item);
	 
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
	 
	 /**
	  * deletes current TreeNode
	  * @param TreeNode<E> root, E item
	  */
	 public void delete(TreeNode<E> root, E item);
	 
	 /**
	  * Searches through BSt for passed treeNode
	  * @param TreeNode<E> parent, E item
	  * @return TreeNode<E> lookUp
	  */
	 public TreeNode<E> getTreeNode(TreeNode<E> parent, E lookUp);
	 
	 /**
	  * gets the parent of passed item
	  * @param root
	  * @param item
	  * @return TreeNode<E>
	  */
	 public TreeNode<E> getParent(TreeNode<E> root, E item);
	 
	 /**
	  * checks if TreeNode has a single child
	  * @param node
	  * @return boolean
	  */
	 public boolean oneChild(TreeNode<E> node);
	 
	 /**
	  * returns the inorder successor of passed TreeNode
	  * @param root
	  * @param node
	  * @return TreeNode<E>
	  */
	 public TreeNode<E> getInorderSuccessor(TreeNode<E> root, TreeNode<E> node);
	 
	 /**
	  * returns the minimum value 
	  * @param node
	  * @return
	  */
	 public TreeNode<E> minVal(TreeNode<E> node);
	 
	 /**
	  * constructs a BST iterator
	  * @param tree
	  */
	 public void constructIterator(BinarySearchTree<E> tree);
	 
	 /**
	  * sorts BST
	  */
	 public LinkedList<E> sort();
	 
	 /**
	  * gets size of BST
	  * @return int size
	  */
	 public int size();
	 
	 /**
	  * converts BST to an Array
	  * @return Array
	  */
	 public Array[] convertBSTtoArr();
	 
}

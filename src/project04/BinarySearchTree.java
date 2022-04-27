package project04;
/**
 * Represents a BST.
 * @author Stephen Alvarez
 * @version 1.0
 */

import java.util.LinkedList;

public class BinarySearchTree<E extends Comparable<E>>{ 

	private TreeNode<E> root;
	private TreeNode<E> current = this.root;
	private int count;

	public BinarySearchTree(){
		this.root = new TreeNode<E>();
		this.current = this.root;
		this.count = 0;
	}

	public BinarySearchTree(BinarySearchTree<E> bst){
		this.root = bst.root;
		this.current = bst.current;
		this.count = bst.count;
	}

	public BinarySearchTree(E rootItem){
		this.root = new TreeNode<E>(rootItem, null, null);
		this.current = this.root;
		this.count++;
	}

	public TreeNode<E> getRoot(){
		return this.root;

	}

	public boolean isEmpty(){
		if (this.getRoot().equals(null)) {
			return true;
		}
		return false;
	}

	public void makeEmpty(){
		this.root = new TreeNode<E>();
		this.current = this.getRoot();
		this.count = 0;
	}

	public boolean search(E item){

		TreeNode<E> searchNode = getTreeNode(root, item);

		if (searchNode.getItem().compareTo(item) == 2)
			return true;
		else if(searchNode.equals(null))
			return false;
		return false;
	}

	public void add(TreeNode<E> newRoot, TreeNode<E> newTreeNode){
		/*
		 * CASE 1:
		 *	Tree is empty
		 *
		 * CASE 2: 
		 * 	CurrentTreeNode has no children
		 * 
		 * CASE 3:
		 * 	CurrentTreeNode has both children
		 * 
		 * CASE 4: 
		 * 	CurrentTreeNode has left child and no right child
		 * 
		 * CASE 5: 
		 * 	CurrentTreeNode has right child and no left child
		 * 
		 */
		current = newRoot;

		if(isEmpty()) {
			//Tree is empty

			this.root = newTreeNode;
			this.current = this.getRoot();
			count++;

		}else if (this.current.getLeft() == null && this.current.getRight() == null) {
			//currentNode has no children

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	

				current.setRight(newTreeNode);
				//current = current.getRight();
				count++;

			}else{
				//newTreeNode is less than or equal to currenNode
				current.setLeft(newTreeNode);
				//current = current.getLeft();
				count++;

			}
		}else if (this.current.getLeft() != null && this.current.getRight() != null){
			//currentNode has both children

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current = current.getRight();
				add(current, newTreeNode);

			}else{
				//newTreeNode is less than or equal to currenNode
				current = current.getLeft();
				add(current, newTreeNode);

			}

		}else if (this.current.getLeft() != null && this.current.getRight() == null){
			//currentNode has left child

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current.setRight(newTreeNode);
				//current = current.getRight();
				count++;

			}else{
				//newTreeNode is less than or equal to currenNode
				current = current.getLeft();
				add(current, newTreeNode);

			}

		}
		else if (this.current.getLeft() == null && this.current.getRight() != null){
			//currentNode has right child

			if (newTreeNode.getItem().compareTo(current.getItem()) == 0) {
				//newTreeNode is greater than currentNode	
				current = current.getRight();
				add(current, newTreeNode);

			}else{
				//newTreeNode is less than or equal to currenNode
				current.setLeft(newTreeNode);
				//current = current.getLeft();
				count++;

			}

		}
	}

	public void insert(E item){
		TreeNode<E> newTreeNode = new TreeNode<E>(item);
		add(this.getRoot(), newTreeNode);

	}

	public TreeNode<E> delete(TreeNode<E> root, E item) throws TreeException{

		TreeNode<E> lookUp = getTreeNode(root, item);
		TreeNode<E> parent = new TreeNode<E>();

		if (lookUp == null) {
			//Throw error: Node not found in BST
			throw new TreeException("Node not found in tree.");
		}

		TreeNode<E> ret = lookUp;

		if (lookUp.getLeft() == null && lookUp.getRight() == null) {
			//TreeNode is a leafNode
			parent = getParent(root, item);
			if(parent.getLeft().getItem().compareTo(lookUp.getItem()) == 2){
				//set parent's left to null
				parent.setLeft(null);
			}else if (parent.getRight().getItem().compareTo(lookUp.getItem()) == 2) {
				//set parent's right to null
				parent.setRight(null);
			}			
			this.count--;
			return ret;
		}

		if (oneChild(lookUp)) {
			//TreeNode has one child
			parent = getParent(root, item);

			if (parent.getLeft().getItem().compareTo(lookUp.getItem()) == 2) {
				if (lookUp.getLeft() == null) {
					parent.setLeft(lookUp.getRight());
					this.count--;
					return ret;
				}

				if (parent.getRight().getItem().compareTo(lookUp.getItem()) == 2) {
					parent.setRight(lookUp.getLeft());
					this.count--;
					return ret;
				}
			}
			if (parent.getRight().getItem().compareTo(lookUp.getItem()) == 2) {

				if (lookUp.getLeft() == null) {
					parent.setRight(lookUp.getRight());
					this.count--;
					return ret;
				}

				if (parent.getRight().getItem().compareTo(lookUp.getItem()) == 2) {
					parent.setRight(lookUp.getLeft());
					this.count--;
					return ret;
				}
			}


		}
		if (lookUp.getLeft() != null && lookUp.getRight() != null) {
			//node has two children

			parent = getParent(root, item);
			TreeNode<E> inorderS = getInorderSuccessor(root, lookUp);

			if (parent.getLeft().getItem().compareTo(lookUp.getItem()) == 2) {

				parent.setLeft(inorderS);
				inorderS.setLeft(lookUp.getLeft());
				inorderS.setRight(lookUp.getRight());
				this.count--;
				return ret;
			}else if (parent.getLeft().getItem().compareTo(lookUp.getItem()) == 2) {
				parent.setLeft(inorderS);
				inorderS.setLeft(lookUp.getLeft());
				inorderS.setRight(lookUp.getRight());
				this.count--;
				return ret;
			}

		}
		this.count--;
		return ret;

	}

	public TreeNode<E> getTreeNode(TreeNode<E> parent, E item) throws TreeException{

		TreeNode<E> lookUp = new TreeNode<E>(item);

		if (parent.getItem().compareTo(lookUp.getItem()) == 2) {
			return parent;
		}
		else if (parent.getLeft() != null && parent.getRight() != null) {
			if (lookUp.getItem().compareTo(parent.getItem()) == 1) {
				//less than or equal to 
				return getTreeNode(parent.getLeft(), lookUp.getItem());
			}else
				return getTreeNode(parent.getRight(), lookUp.getItem());


		}else if (parent.getRight() == null) {

			return getTreeNode(parent.getLeft(), lookUp.getItem());
		}else if (parent.getLeft() == null) {

			return getTreeNode(parent.getRight(), lookUp.getItem());
		}else 
		{
			//throw if both dont exist
			throw new TreeException("Node not found in tree.");
			
		}
		
		//return null;
	}

	public TreeNode<E> getParent(TreeNode<E> root, E item){

		if (root == null || root.getItem().compareTo(item) == 2) {
			return null;
		}else if(root.getLeft() != null && (root.getLeft().getItem().compareTo(item) == 2) || root.getRight() != null && (root.getRight().getItem().compareTo(item) == 2)){
			return root;
		}

		TreeNode<E> newTreeNode = getParent(root.getLeft(), item);

		if (newTreeNode != null) {
			return newTreeNode;
		}

		newTreeNode = getParent(root.getRight(), item);

		return newTreeNode;
	}

	public boolean oneChild(TreeNode<E> node){
		TreeNode<E> parent = getTreeNode(this.root, node.getItem());

		if (parent.getLeft() != null && parent.getRight() != null ) {
			return false;
		}
		return true;
	}

	public TreeNode<E> getInorderSuccessor(TreeNode<E> root, TreeNode<E> node){
		if (node.getRight() != null) {
			return minVal(node.getRight());
		}


		TreeNode<E> parent = getParent(root, node.getItem());
		while (parent != null && node == parent.getRight()) {
			node = parent;
			parent = getParent(root, parent.getItem());
		}
		return parent;
	}

	public TreeNode<E> minVal(TreeNode<E> node){
		TreeNode<E> curr = node;

		while (curr.getLeft() != null) {
			curr = curr.getLeft();
		}
		return curr;
	}


	public BinarySearchTreeIterator<E> constructIterator(BinarySearchTree<E> tree){
		BinarySearchTreeIterator<E> treeIt = new BinarySearchTreeIterator<E>(tree);
		return treeIt;
	}

	public LinkedList<E> sort(){
		LinkedList<E> sortedTree = new LinkedList<>();
		BinarySearchTreeIterator<E> treeIt = constructIterator(this);
		
		treeIt.setInorder();
		
		while(treeIt.hasNext()){
			sortedTree.add(treeIt.next());
			
		}
		
		return sortedTree;
	}

	public int size(){
		return this.count;

	}

	public Course[] convertBSTtoArr(){
		
		Course array[] = new Course [this.size()];
		LinkedList<E> sortedTree = sort();
		
		for (int i = 0; i < sortedTree.size(); i++) {
			array[i] = (Course) sortedTree.get(i);
		}
		
		return array;
	}
}

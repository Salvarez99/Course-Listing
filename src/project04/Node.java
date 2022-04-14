package project04;

public class Node<E> {

	Object item;
	Node<E> left;
	Node<E> right;
	
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public Node<E> getLeft() {
		return left;
	}
	public void setLeft(Node<E> left) {
		this.left = left;
	}
	public Node<E> getRight() {
		return right;
	}
	public void setRight(Node<E> right) {
		this.right = right;
	}
	
	
}

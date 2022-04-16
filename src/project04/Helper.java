package project04;

import java.util.ArrayList;

public class Helper {
	public static void start(){
		create();
	}

	public static void create(){
		

		
		
		
		
		Course obj = new Course(123, "Science", 401, "Title", "Undergraduate");
		Course obj2 = new Course(205, "Science", 401, "Title", "Undergraduate");
		Course obj3 = new Course(100, "Science", 401, "Title", "Undergraduate");
		Course obj4 = new Course(50, "Science", 401, "Title", "Undergraduate");
		Course obj5 = new Course(20, "Science", 401, "Title", "Undergraduate");
		Course obj6 = new Course(75, "Science", 401, "Title", "Undergraduate");
		Course obj7 = new Course(175, "Science", 401, "Title", "Undergraduate");
		Course obj8 = new Course(220, "Science", 401, "Title", "Undergraduate");
		
		BinarySearchTree<Course> tree = new BinarySearchTree<Course>(obj);
		
		TreeNode<Course> TN = new TreeNode<Course>(obj2);
		TreeNode<Course> TN2 = new TreeNode<Course>(obj3);
		TreeNode<Course> TN3 = new TreeNode<Course>(obj4);
		TreeNode<Course> TN4 = new TreeNode<Course>(obj5);
		TreeNode<Course> TN5 = new TreeNode<Course>(obj6);
		TreeNode<Course> TN6 = new TreeNode<Course>(obj7);
		TreeNode<Course> TN7 = new TreeNode<Course>(obj8);
		
		tree.insert(TN);
		tree.insert(TN2);
		tree.insert(TN3);
		tree.insert(TN4);
		tree.insert(TN5);
		tree.insert(TN6);
		tree.insert(TN7);
		
		System.out.println(tree.size());
	}
}

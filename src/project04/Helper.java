package project04;

public class Helper {
	public static void start(){
		create();
	}

	public static void create(){
		Course obj = new Course(123, "Science", 401, "Title", "Undergraduate");
		Course obj2 = new Course(205, "Science", 401, "Title", "Undergraduate");
		Course obj3 = new Course(100, "Science", 401, "Title", "Undergraduate");
		Course obj4 = new Course(100, "Science", 401, "Title", "Undergraduate");
		
		BinarySearchTree<Course> tree = new BinarySearchTree<Course>(obj);
		
		TreeNode<Course> TN = new TreeNode<Course>(obj2);
		TreeNode<Course> TN2 = new TreeNode<Course>(obj3);
		TreeNode<Course> TN3 = new TreeNode<Course>(obj4);
		
		tree.insert(TN);
		tree.insert(TN2);
		tree.insert(TN3);
		
		System.out.println(tree.size());
	}
}

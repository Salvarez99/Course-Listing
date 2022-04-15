package project04;

public class Helper {
	public static void start(){
		create();
	}

	public static void create(){
		Course obj = new Course(123, "Science", 401, "Title", "Undergraduate");
		
		
		BinarySearchTree<Course> tree = new BinarySearchTree<Course>(obj);
		
		tree.isEmpty();
	}
}

package project04;

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
		

		
		tree.insert(obj2);
		tree.insert(obj3);
		tree.insert(obj4);
		tree.insert(obj5);
		tree.insert(obj6);
		tree.insert(obj7);
		tree.insert(obj8);
		
		System.out.println(tree.size());
		tree.makeEmpty();
		System.out.println(tree.size());
		
	}
}

package project04;

public class Helper {
	public static void start(){
		create();
	}

	public static void create(){
		ClassAttributes obj = new ClassAttributes(123, "Science", 401, "Title", "Undergraduate");
		
		
		BST<ClassAttributes> tree = new BST(obj);
	}
}

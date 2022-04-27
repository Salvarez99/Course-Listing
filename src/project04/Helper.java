package project04;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Helper {
	public static void start() throws FileNotFoundException{
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		BinarySearchTree<Course> tree = new BinarySearchTree<>();
		LinkedList<Course> sortedTree;
		Course[] courseArray;
		Course insert = new Course(2000, "ICSI", 120, "Example Course", "Undergraduate");

		create(intList, stringList);
		createCourses(intList, stringList, courseList);
		addToBST(courseList, tree);
		
		System.out.println("Root: " + tree.getRoot() + "\n");
		
		System.out.println("Is Tree Empty? " + tree.isEmpty() + "\n");
		
		System.out.println("Tree size: " + tree.size() + "\n");
		
		
		System.out.println("Search for " + courseList.get(7) + ":\n" + tree.search(courseList.get(0)) + "\n");
		
		
		tree.insert(insert);
		System.out.println("Search for " + insert + ":\n" + tree.search(insert) + "\n");
		
		tree.delete(tree.getRoot(), insert); //works
		System.out.println("Search for " + insert + ":\n");//works
		tree.search(insert);//issues
		
		System.out.println(tree.getTreeNode(tree.getRoot(), courseList.get(3)) + "\n");
		
		System.out.println("Sort() ");
		sortedTree = sortTree(tree);
		displaySortedTree(sortedTree);
		
		System.out.println("\nConvertBSTtoArr() ");
		courseArray = tree.convertBSTtoArr();
		displaySortedArray(courseArray);
		
		tree.makeEmpty();
		System.out.println("\nIs Tree Empty? " + tree.isEmpty() + "\n");
		System.out.println("Tree size: " + tree.size() + "\n");

	
	}

	public static void create(ArrayList<Integer> intList, ArrayList<String> courseList) throws FileNotFoundException{

		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<StringTokenizer> stringTokenList = new ArrayList<>();
		StringTokenizer stringToken;

		File file= new File("dataList.txt");
		Scanner scan = new Scanner(file);
		int i = 0;

		//scans textfile and adds to String arraylist
		while (scan.hasNext()) {
			stringList.add(scan.nextLine());
		}

		//output String arraylist
		while(i < stringList.size()){
			stringToken = new StringTokenizer(stringList.get(i) , "\t");
			stringTokenList.add(stringToken);
			i++;
		}

		int counter = 0;
		i = 0;

		//Loops through stringList
		while(i < stringList.size()){
			//Loops through all tokens in StringTokenList
			while (stringTokenList.get(i).hasMoreTokens()) {
				//if # mod 5 is equal to 0 or 2, print token
				if (counter % 5 == 0 || counter % 5 == 2) {
					intList.add(Integer.parseInt(stringTokenList.get(i).nextToken()));

				}
				//else move token forward without printing
				else{
					courseList.add(stringTokenList.get(i).nextToken());
				}
				counter++;
			}
			i++;
		}
		scan.close();
	}

	public static void createCourses(ArrayList<Integer> intList, ArrayList<String> stringList, ArrayList<Course> courseList){
		for (int i = 0; i < intList.size(); i++) {
			Course c = new Course(intList.get(i), intList.get(i + 1));
			courseList.add(c);
			i = i + 1;
		}

		int i = 0;
		while(i < stringList.size() / 3) {
			for (int j = 0; j < courseList.size(); j++) {
				courseList.get(j).setCourseSubject(stringList.get(i));
				courseList.get(j).setClassTitle(stringList.get(i + 1));
				courseList.get(j).setLevel(stringList.get(i + 2));
				i += 3;

			}
		}
	}

	public static void addToBST(ArrayList<Course> courseList, BinarySearchTree<Course> tree){
		
		for (int i = 0; i < courseList.size(); i++) {
			tree.insert(courseList.get(i));
		}
	}

	public static LinkedList<Course> sortTree(BinarySearchTree<Course> tree){
		return tree.sort();

	}

	public static void displaySortedTree(LinkedList<Course> sortedTree){
		
		int i = 0;
		while(i < sortedTree.size()){
			System.out.println(sortedTree.get(i));
			i++;
		}
	}

	public static void displaySortedArray(Course[] courseArray){
		for (int i = 0; i < courseArray.length; i++) {
			System.out.println(courseArray[i]);
		}
	}
	
	
}

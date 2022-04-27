package project04;
/**
 * Represents a Class.
 * @author Stephen Alvarez
 * @version 1.0
 */

public class Course implements Comparable<Course> {

	private int classNumber;
	private String courseSubject;
	private int catalogNumber;
	private String classTitle;
	private String level;

	public Course(){
		this.classNumber = 0;
		this.courseSubject = "";
		this.catalogNumber = 0;
		this.classTitle = "";
		this.level = "";
	}

	public Course(int classNumber, int catalogNumber) {
		this.classNumber = classNumber;
		this.catalogNumber = catalogNumber;
	}
	
	public Course(int classNumber, String courseSubject, int catalogNumber, String classTitle, String level) {
		this.classNumber = classNumber;
		this.courseSubject = courseSubject;
		this.catalogNumber = catalogNumber;
		this.classTitle = classTitle;
		this.level = level;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}

	public int getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override 
	public String toString(){
		return this.getClassNumber() + " " + this.getCourseSubject() + " " + this.getCatalogNumber() + " " + this.getClassTitle() + " " + this.getLevel();
	}

	@Override
	public int compareTo(Course course) {
		if (this.getClassNumber() < course.getClassNumber()) {
			//less than 
			return 1;
		}
		else if(this.getClassNumber() == course.getClassNumber()){
			//equal to

			return 2;
		}
		//greater than 
		return 0;
	}


}

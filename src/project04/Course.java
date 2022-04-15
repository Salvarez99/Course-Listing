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
	public int compareTo(Course course) {
		if (this.classNumber > course.classNumber) {
			return 1;
		}else 
			return 0;
	}

}

package project04;

public class ClassAttributes {
	private int classNumber;
	private String courseSubject;
	private int catalogNumber;
	private String classTitle;
	private String level;

	public ClassAttributes(){
		this.classNumber = 0;
		this.courseSubject = "";
		this.catalogNumber = 0;
		this.classTitle = "";
		this.level = "";
	}

	public ClassAttributes(int classNumber, String courseSubject, int catalogNumber, String classTitle, String level) {
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


}

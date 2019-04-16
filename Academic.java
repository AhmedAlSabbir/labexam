

import java.io.Serializable;

public class Academic implements Serializable
{
	
	private final String regNumber;
	private String semester;
	private String year;
	private double grade;
	
	public Academic(String regNumber, String semester, String year, double grade) 
	{
		this.regNumber = regNumber;
		this.semester = semester;
		this.year = year;
		this.grade= grade;
		
	}
	public String getRegNo() {
		return regNumber;
	}
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getgrade() {
		return grade;
	}
	public void setgrade(double grade) {
		this.grade = grade;
	}

}
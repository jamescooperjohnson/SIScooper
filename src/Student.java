public class Student {
	private String first;
	private String last;
	private String class1;
	private String grade1;
	private String class2;
	private String grade2;
	private String class3;
	private String grade3;
	private double GPA;

	public Student(String f, String l, String c1, String g1, String c2,
			String g2, String c3, String g3, double gpa) {
		first = f;
		last = l;
		class1 = c1;
		grade1 = g1;
		class2 = c2;
		grade2 = g2;
		class3 = c3;
		grade3 = g3;
		GPA = gpa;
	}

	
	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getClass1() {
		return class1;
	}

	public String getGrade1() {
		return grade1;
	}

	public String getClass2() {
		return class2;
	}

	public String getGrade2() {
		return grade2;
	}

	public String getClass3() {
		return class3;
	}

	public String getGrade3() {
		return grade3;
	}
	
	public double getGpa() {
	    return GPA;
	}
	public void setC1(String newG) {
	       this.class1 = newG;
	}
	public void setG1(String newG) {
	       this.grade1 = newG;
	}
	 
	public void setC2(String newGrade) {
	       this.class2 = newGrade;
	}public void setG2(String newG) {
	       this.grade2 = newG;
	} 
	public void setC3(String newG) {
	       this.class3 = newG;
	}
	public void setG3(String newG) {
	       this.grade3 = newG;
	}
	
	public void setGpa (double gpa) {
		   this.GPA = gpa;
	}
}
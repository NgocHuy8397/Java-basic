
public class Student {
	private String studentCode;
	private String firstAndLastName;
	private Date dateOfBirth;
	private double mediumScore;
	private Class cl;
	
	public Student(String studentCode, String firstAndLastName, Date dateOfBirth, double mediumScore, Class cl) {
		this.studentCode = studentCode;
		this.firstAndLastName = firstAndLastName;
		this.dateOfBirth = dateOfBirth;
		this.mediumScore = mediumScore;
		this.cl = cl;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFirstAndLastName() {
		return firstAndLastName;
	}

	public void setFirstAndLastName(String firstAndLastName) {
		this.firstAndLastName = firstAndLastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}

	public Class getCl() {
		return cl;
	}

	public void setCl(Class cl) {
		this.cl = cl;
	}
	
	public String  nameFaculty() {
		return this.cl.getFacultyName();
	}
	
	public boolean passTheExam() {
		return this.mediumScore >= 5;
	}
	
	public boolean CheckSameDateOfBirth(Student student1) {
		return this.dateOfBirth.equals(student1.dateOfBirth);
				
	}
	
}

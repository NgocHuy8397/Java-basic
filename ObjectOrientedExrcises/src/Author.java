
public class Author {
	private String theWriterName;
	private Date dateOfBirth;
	
	public Author(String theWriterName, Date dateOfBirth) {
		this.theWriterName = theWriterName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getTheWriterName() {
		return theWriterName;
	}

	public void setTheWriterName(String theWriterName) {
		this.theWriterName = theWriterName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}

// This is a student class created based on the uml diagram in the assignment description


public class Student {
	private String name;
	private long IDnumber;
	//I was unclear from the UML diagram if the Student() constructor should be an //empty  default constructor e.g.

	//public Student(){}

	//However, I went with the below as it follows the Bicycle example from class
	// which provided default values

	// Constructor with default values 
	public Student() {
		this.name = "Unassigned";
		this.IDnumber =0;
	}
//Constructor allowing to fill in variables
	public Student(String StudentName, long Id) {
		this.name=StudentName;
		this.IDnumber=Id;
	}
//overwriting toString method
	public String toString() {
		return "Student[" +getName()+", "+ getIDnumber() +"]";
		
	}
//name getter / returns name
	public String getName() {
		return name;		
		}	
//name setter
	public void setName(String studentName) {
		this.name=studentName;
	}
//student IDnumber getter / returns studentID
	public long getIDnumber() {
		return IDnumber;		
	}
//student IDnumber setter
	public void setIDnumber(long studentID) {
		this.IDnumber=studentID;
	}



}

//Student Name: Brónagh Colton

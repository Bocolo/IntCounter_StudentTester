//This is an assignment to test the STUDENT class by populating an array of STUDENTs 
// and iterating over the results to display the contents






import java.lang.Math;

public class StudentTester {		
	public static void main(String[]args) {
		//Initialising Student Array
		Student[] students = new Student[5];
		
		//Creating an array for student names
		String[] studentNames = {"Adam","Laura","John", "Louise", "Sarah"};
		
		//creating a starting id number
		int firstId=12345;
		
		//looping to populate students array
		for(int i =0; i<studentNames.length;i++) {
		students[i] = new Student(studentNames[i],firstId+i);
		System.out.println(students[i].toString());
		}	
	}	
}

//public class StudentTester {
//
//
//
//public static void main(String[]args) {
//	//Initialising Student Array
//	Student[] students = new Student[5];
//	
//	students[0]=new Student("Adam", 12345);
//	students[1]=new Student("Laura", 12346);
//	students[2]=new Student("John", 12347);
//	students[3]=new Student("Louise", 12348);		
//	students[4] = new Student("Sarah",12349);
//	
//	//Looping over the array
//	for(int i=0; i< students.length; i++) {
//
//		
//		//printing student info using toString()
//		System.out.println(students[i].toString());
//		
//		
//
//	}		
//}	
//}


//Student Name: Brónagh Colton

//Student[] students2 = new Student[5];
//String[] studentNames = {"Adam","Laura","John", "Louise", "Sarah"};
//int firstId=123455;
//for(int i =0; i<studentNames.length;i++) {
//	students2[i] = new Student(studentNames[i],firstId+i);
//}
//printing Student names and ID numbers using getters
//System.out.println(students[i].getName() 
//	+ " is a student at NUIG.  \r\n"
//	+ students[i].getName()
//	+"'s student ID number is " 
//	+ students[i].getIDnumber() +".\r\n");
//
//Looping over the array
//for(int i=0; i< students.length; i++) {
//	
//	//printing student info using toString()
//	System.out.println(students[i].toString());
//				
//}	

// Another option for populating the Array without creating FillStudentArray() method

//methods for population of the student array 
//private static void FillStudentArray(String name, int idNum, Student[] arr, int arrPos) {
//	arr[arrPos] = new Student();
//	arr[arrPos].setName(name);
//	arr[arrPos].setIDnumber(idNum);
//	}
//private static void FillStudentArray(String name, int idNum, Student[] arr, int arrPos) {
//  arr[arrPos] = new Student(name, idNum)
//}

//Other Option for Printing Names and IDs
//	**********************************
//String name =students[i].getName();
//long id =students[i].getIDnumber();
//System.out.println(name +" is a student at NUIG.  \r\n"+name+"'s student ID number is "+ id +".\r\n");


//Populating Student Array using method

// Populating Student Array using method
//FillStudentArray("Adam", 12345, students, 0);
//FillStudentArray("Laura", 12346, students, 1);
//FillStudentArray("John", 12347, students, 2);
//FillStudentArray("Louise", 12348, students, 3);
////FillStudentArray("Sarah", 12349, students, 4);
//student[4] = new Student
//
//		students[0]=new Student("Adam", 12345);
//		students[1]=new Student("Laura", 12346);
//		students[2]=new Student("John", 12347);
//		students[3]=new Student("Louise", 12348);
//		//FillStudentArray("Sarah", 12349);
//		
//		students[4] = new Student("Sarah",55);
//Populating Array with 5 Students
//students[0]=new Student();
//students[0].setName("Adam");
//students[0].setIDnumber(111111);
//
//students[1]=new Student();
//students[1].setName("Laura");
//students[1].setIDnumber(111112);
//
//students[2]=new Student();
//students[2].setName("John");
//students[2].setIDnumber(111113);
//
//students[3]=new Student();
//students[3].setName("Louise");
//students[3].setIDnumber(111114);
//
//students[4]=new Student();
//students[4].setName("Sarah");
//students[4].setIDnumber(111115);

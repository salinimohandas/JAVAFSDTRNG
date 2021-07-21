package com.ust.examples;

 class StudentNotFoundException extends Exception{
	 
	public StudentNotFoundException(String message) {
		super(message);
	}
}
 class Student11{
	 
	 Student11(){}
	 
 }
 class StudentManager{
	 
	public Student11 find(String studentID) throws StudentNotFoundException{
		
		if(studentID.equals("12345"))
				{
			return new Student11();
			}
		
			else
			{
				throw new StudentNotFoundException("Could not find student with ID"+studentID);
			}
		}
	}
 class StudentTest {

	public static void main(String[] args) {
		StudentManager man = new StudentManager();
		try {
			Student11 student=man.find("0001");
		}
	catch(StudentNotFoundException ex) {
		System.err.print(ex);
		}
	
	}

}

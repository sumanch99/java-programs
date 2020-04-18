// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
    	String a="123 456 789";
		System.out.print(a.charAt(1)); 
    } 
}

public class nptel{ 
    public static void main(String args[]){
// Create an object of class Student
		Student std=new Student();
// Call 'print()' method of class Student
		std.print();
	}
}
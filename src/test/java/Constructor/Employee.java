package Constructor;

public class Employee {  // Constructor is used to initialization of object--> values are initialized-->No any return type

	// Example of Constructor

	String name; // I declare a variable
	int emp_id;

	Employee(String name, int emp_id) // paramatrized constructor
	{
		this.name=name;
		this.emp_id=emp_id;

	}

	public static void main(String[] args) 
	{
		Employee e1= new Employee("Deepak",101); // paramatrized constructor i declared
		Employee e2= new Employee("Pappu",102);

		System.out.println("Employee 1: "+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2: "+e2.name+" "+e2.emp_id);

	}

}

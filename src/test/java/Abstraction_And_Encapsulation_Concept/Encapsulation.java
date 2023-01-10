package Abstraction_And_Encapsulation_Concept;

class Employee  // Encapsulation Concept
{
	private int empid;  // Data hiding---> I create private variable--->Our Data become private
	
	public void setEmpid(int eid)  // setter used---> to set the value in the data
	{
		empid= eid;  //eid value initialize with empid
	}
	public int getEmpid()  // getter used--> to view the data
	{
		return empid;
	}

}
class Company
{
	public static void main(String[] args) 
	{

		Employee e= new Employee();  // object create of Employee class
		e.setEmpid(10);  // set the value in this variable
		System.out.println(e.getEmpid());  // to view the data through method
	}

}
